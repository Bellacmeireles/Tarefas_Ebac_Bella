package Modulo25.ExemploVendasMod25.main.dao;

import Modulo25.ExemploVendasMod25.main.domain.Cliente;

public class ClienteDAO implements IClienteDAO {

    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return null;
    }

    
    @Override
    public void excluir(Long cpf) {
        
    }
    
    
}
