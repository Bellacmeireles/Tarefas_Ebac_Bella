package Modulo25.ExemploVendasMod25.main.services;

import Modulo25.ExemploVendasMod25.main.domain.Cliente;

public interface IClienteService {

    Boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);
    
}
