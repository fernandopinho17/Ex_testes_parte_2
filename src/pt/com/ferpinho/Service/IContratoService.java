package pt.com.ferpinho.Service;

public interface IContratoService {
    String salvar();

    boolean excluirContratoPorId(int contratoId);

    boolean atualizarContrato(int contratoId, String novaDescricao);

    String buscarContratoPorId(int contratoId);

    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}
