package Modulo14.dao;
// IMPLEMENTAÇÃO

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import Modulo14.TarefaCadastro.Cliente;

public class ClienteMapDAO implements IClienteDAO {

    private Map<Long, Cliente> map;

    // Construtor
    public ClienteMapDAO() {
        this.map = new HashMap<>();

    }

    // Metodos
    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())) {
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = this.map.get(cpf);
        
        if (clienteCadastrado != null) {
            this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
        if (clienteCadastrado != null) {
            cliente.setNome(cliente.getNome());
            cliente.setTel(cliente.getTel());
            cliente.setNumero(cliente.getNumero());
            cliente.setEnd(cliente.getEnd());
            cliente.setCidade(cliente.getCidade());
            cliente.setEstado(cliente.getEstado());
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }
    
}
