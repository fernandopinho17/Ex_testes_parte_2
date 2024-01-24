package pt.com.ferpinho.dao;

import org.junit.Assert;
import pt.com.ferpinho.Service.ClienteService;
import org.junit.Test;
import pt.com.ferpinho.dao.moks.ClienteDaoMock;


public class ClienteServiceTest {
    @Test
    public void  salvarTest() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService((ClienteDaoMock) mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
