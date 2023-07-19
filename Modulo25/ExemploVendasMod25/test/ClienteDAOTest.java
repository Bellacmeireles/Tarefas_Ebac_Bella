package Modulo25.ExemploVendasMod25.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Modulo25.ExemploVendasMod25.main.dao.IClienteDAO;
import Modulo25.ExemploVendasMod25.main.domain.Cliente;
import Modulo25.ExemploVendasMod25.main.exceptions.TipoChaveNaoEncontradaException;
import Modulo25.ExemploVendasMod25.test.dao.ClienteDaoMock;

public class ClienteDAOTest {

    private IClienteDAO clienteDao;
    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDao = new ClienteDaoMock();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(1234567891L);
        cliente.setNome("Bella");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setNumero(10);
        cliente.setTel(12997161270l);

        clienteDao.cadastrar(cliente);

    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteDao.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }
    
    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());
    } 

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Bella Cabral");
        clienteDao.alterar(cliente);

        Assert.assertEquals("Bella Cabral", cliente.getNome());
    } 

}
