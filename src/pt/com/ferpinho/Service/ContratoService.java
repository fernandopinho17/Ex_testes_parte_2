package pt.com.ferpinho.Service;

import pt.com.ferpinho.dao.IContratoDao;


public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    public ContratoService() {

    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public boolean excluirContratoPorId(int contratoId) {
        return false;
    }

    @Override
    public boolean atualizarContrato(int contratoId, String novaDescricao) {
        return false;
    }

    @Override
    public String buscarContratoPorId(int contratoId) {
        return null;
    }

    // Outros métodos de buscar, excluir e atualizar conforme necessário
}






