package Modulo23e24.Mod24.Tarefa24;

import org.junit.Assert;
import org.junit.Test;

import Modulo23e24.Mod24.aulapart2TDD.ContratoDao;
import Modulo23e24.Mod24.aulapart2TDD.ContratoDaoMock;
import Modulo23e24.Mod24.aulapart2TDD.ContratoService;
import Modulo23e24.Mod24.aulapart2TDD.IContratoDao;
import Modulo23e24.Mod24.aulapart2TDD.IContratoService;

/**
 * Mód 24 aula 2 -
 * 
 * 1º classe criada
 * 
 * Fazer métodos de buscar, excluir e atualizar
 */


public class ContratoServiceTestTarefa {

    @Test
    public void salvarTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    /* Tarefa Criando testes(buscar, excluir, atualizar) */

    @Test
    public void buscarTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService serviceB = new ContratoService(dao);
        String retornoB = serviceB.buscar();
        Assert.assertEquals("Buscando Cliente", retornoB);
    }

    @Test
    public void excluirTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService serviceE = new ContratoService(dao);
        String retornoE = serviceE.excluir();
        Assert.assertEquals("Cliente Deletado", retornoE);
    }

    @Test
    public void atualizarTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService serviceA = new ContratoService(dao);
        String retornoA = serviceA.atualizar();
        Assert.assertEquals("Dados atualizados com sucesso", retornoA);
    }

    /**
     * @testes de erro
     */

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    /* Tarefa Criando testes(buscar, excluir, atualizar) */

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErrobuscarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService serviceB = new ContratoService(dao);
        String retornoB = serviceB.buscar();
        Assert.assertEquals("Buscando Cliente", retornoB);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroexcluirtComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService serviceE = new ContratoService(dao);
        String retornoE = serviceE.excluir();
        Assert.assertEquals("Cliente Deletado", retornoE);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAtualizartComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService serviceA = new ContratoService(dao);
        String retornoA = serviceA.atualizar();
        Assert.assertEquals("Cliente Deletado", retornoA);
    }

}
