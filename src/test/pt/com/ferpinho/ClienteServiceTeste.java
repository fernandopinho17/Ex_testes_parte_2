package test.pt.com.ferpinho;

import pt.com.ferpinho.dao.IClienteDao;

import pt.com.ferpinho.dao.ClienteDao;
import pt.com.ferpinho.dao.moks.ClienteDaoMock;
import pt.com.ferpinho.Service.ClienteService;
import org.junit.Assert;
import org.junit.Test;
public class ClienteServiceTeste {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
