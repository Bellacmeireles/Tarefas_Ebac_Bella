package Modulo23e24.Mod24.aulapart2TDD;

import org.junit.Assert;
import org.junit.Test;

import Modulo23e24.Mod24.aulapart1.service.TesteCliente;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {

        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Rod");
        cli.adicionarNome("Bella");

        Assert.assertEquals("Rod", cli.getNome());
    }
}
