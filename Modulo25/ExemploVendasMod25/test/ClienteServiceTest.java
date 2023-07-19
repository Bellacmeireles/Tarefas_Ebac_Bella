package Modulo25.ExemploVendasMod25.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/* import Modulo25.ExemploVendasMod25.main.dao.ClienteDAO; */
import Modulo25.ExemploVendasMod25.main.dao.IClienteDAO;
import Modulo25.ExemploVendasMod25.main.domain.Cliente;
import Modulo25.ExemploVendasMod25.main.exceptions.TipoChaveNaoEncontradaException;
import Modulo25.ExemploVendasMod25.main.services.ClienteService;
import Modulo25.ExemploVendasMod25.main.services.IClienteService;
import Modulo25.ExemploVendasMod25.test.dao.ClienteDaoMock;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {

        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);

    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(1234567891L);
        cliente.setNome("Bella");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(12997161270L);
        //clienteService.salvar(cliente);
    }

    @Test
    public void pesquisarCliente() {

        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);

    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteService.salvar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Bella Cabral");
        clienteService.alterar(cliente);

        Assert.assertEquals("Bella Cabral", cliente.getNome());
    }

}
