package test.pt.com.ferpinho;

import org.junit.Assert;
import org.junit.Test;

public class TesteCliente {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Rodrigo");
        cli.adicionarNome("Rodrigo");

        Assert.assertEquals("Rodrigo", cli.getNome());
    }

    private String getNome() {
        String o = null;
        return o;
    }

    private void adicionarNome(String rodrigo) {

    }
}
