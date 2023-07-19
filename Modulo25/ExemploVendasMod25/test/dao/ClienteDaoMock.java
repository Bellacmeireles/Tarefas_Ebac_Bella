package Modulo25.ExemploVendasMod25.test.dao;

import java.util.Collection;

import Modulo25.ExemploVendasMod25.main.dao.IClienteDAO;
import Modulo25.ExemploVendasMod25.main.domain.Cliente;
import Modulo25.ExemploVendasMod25.main.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDaoMock implements IClienteDAO {

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Long valor) {
        //Auto-generated method stub
        
    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
        // Auto-generated method stub
        
    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente();
        cliente.setCpf(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        // Auto-generated method stub
        return null;
    }

   /*  @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public void excluir(Long cpf) {
        
        
    }

    @Override
    public void alterar(Cliente cliente) {
        
    } */

}
