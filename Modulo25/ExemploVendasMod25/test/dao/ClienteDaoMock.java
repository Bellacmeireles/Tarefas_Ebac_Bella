package Modulo25.ExemploVendasMod25.test.dao;

import Modulo25.ExemploVendasMod25.main.dao.IClienteDAO;
import Modulo25.ExemploVendasMod25.main.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO {

    @Override
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

}
