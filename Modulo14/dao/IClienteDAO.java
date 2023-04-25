package Modulo14.dao;

import java.util.Collection;

import Modulo14.TarefaCadastro.Cliente;

public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar (Cliente cliente);
    public Cliente consultar(Long cpf);
    public Collection<Cliente> buscarTodos();
}
