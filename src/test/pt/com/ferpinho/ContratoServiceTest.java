package test.pt.com.ferpinho;

import pt.com.ferpinho.dao.ContratoDao;
import pt.com.ferpinho.dao.IContratoDao;
import pt.com.ferpinho.Service.ContratoService;
import org.junit.Assert;
import org.junit.Test;
import pt.com.ferpinho.Service.IContratoService;



public class ContratoServiceTest {
    @Test
    public  void salvarTest() {
        IContratoService service = new ContratoService();
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = (IContratoDao) (IContratoDao) new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    //TODO
    //Fazer métodos de buscar, excluir e atualizar


    @Test
    public void buscarContratoPorIdTest() {
        // Criar um contrato de exemplo com um ID específico
        IContratoDao dao = (IContratoDao) new ContratoDao();
        IContratoService service = new ContratoService(dao);

        // Adicionar o contrato ao banco de dados
        int contratoId = 1; // Supondo que este é o ID do contrato adicionado
        String retorno = service.buscarContratoPorId(contratoId);

        // Verificar se o retorno não é nulo
        Assert.assertNotNull(retorno);
    }

    @Test
    public void excluirContratoPorIdTest() {
        // Criar um contrato de exemplo com um ID específico
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);

        // Adicionar o contrato ao banco de dados
        int contratoId = 2; // Supondo que este é o ID do contrato adicionado
        boolean excluidoComSucesso = service.excluirContratoPorId(contratoId);

        // Verificar se o contrato foi excluído com sucesso
        Assert.assertTrue(excluidoComSucesso);
    }

    @Test
    public void atualizarContratoTest() {
        // Criar um contrato de exemplo com um ID específico
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);

        // Adicionar o contrato ao banco de dados
        int contratoId = 3; // Supondo que este é o ID do contrato adicionado
        String novaDescricao = "Nova Descrição";

        // Atualizar o contrato
        boolean atualizadoComSucesso = service.atualizarContrato(contratoId, novaDescricao);

        // Verificar se o contrato foi atualizado com sucesso
        Assert.assertTrue(atualizadoComSucesso);
    }

}





