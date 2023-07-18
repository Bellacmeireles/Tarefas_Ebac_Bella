package Modulo25.ExemploVendasMod25.main.dao;

import Modulo25.ExemploVendasMod25.main.domain.Cliente;

public interface IClienteDAO {

    Boolean salvar(Cliente cliente);
   
    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);
    
}
