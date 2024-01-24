package pt.com.ferpinho.dao;


public abstract class IContratoDao {
    public abstract void salvar();

    //TODO
    //Fazer métodos de buscar, excluir e atualizar e implementar testes


    public abstract Contrato buscarPorId(int id);

    public abstract boolean excluirPorId(int id);

    public abstract boolean atualizarContrato(int id, Contrato novoContrato);

    class Contrato {
    }
}


