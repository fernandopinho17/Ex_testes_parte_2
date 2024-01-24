package pt.com.ferpinho.dao;
import java.util.HashMap;
import java.util.Map;

public class ContratoDao extends IContratoDao {

    // Simulação de um banco de dados
    private final Map<Integer, Contrato> contratos;

    public ContratoDao() {
        this.contratos = new HashMap<>();
    }

    @Override
    public void salvar() {
        // Lógica para salvar um contrato no banco de dados (pode ser simulado aqui)
    }

    @Override
    public IContratoDao.Contrato buscarPorId(int id) {
        return null;
    }

    public <Contrato> Contrato buscarPorId() {
        return (Contrato) buscarPorId(0);
    }



    @Override
    public boolean excluirPorId(int id) {
        return contratos.remove(id) != null;
    }

    @Override
    public boolean atualizarContrato(int id, Contrato novoContrato) {
        if (contratos.containsKey(id)) {
            contratos.put(id, novoContrato);
            return true;
        }
        return false;
    }
}