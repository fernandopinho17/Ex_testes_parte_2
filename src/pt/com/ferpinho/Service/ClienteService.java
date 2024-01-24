package pt.com.ferpinho.Service;

import org.junit.Assert;
import org.junit.Test;
import pt.com.ferpinho.dao.ClienteDao;
import pt.com.ferpinho.dao.moks.ClienteDaoMock;
import pt.com.ferpinho.dao.IClienteDao;

public class ClienteService {


    public ClienteService(IClienteDao mockDao) {
    }

    @Test
    public String salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service;
        service = new ClienteService((ClienteDaoMock) mockDao);
        String retorno = service.salvarTest();
        Assert.assertEquals("Sucesso", retorno);
        return retorno;
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService((ClienteDaoMock) mockDao);
        String retorno = service.salvarTest();
        Assert.assertEquals("Sucesso", retorno);
    }

    public String salvar() {
        String o = null;
        return o;
    }
}
