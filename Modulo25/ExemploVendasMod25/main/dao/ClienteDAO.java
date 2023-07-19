package Modulo25.ExemploVendasMod25.main.dao;

import Modulo25.ExemploVendasMod25.main.dao.generics.GenericDAO;
import Modulo25.ExemploVendasMod25.main.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {

    public ClienteDAO() {
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
        
    }

}
