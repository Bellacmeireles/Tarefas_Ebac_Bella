package Modulo25.ExemploVendasMod25.main.services;

/* import Modulo25.ExemploVendasMod25.main.dao.ClienteDAO;
 */import Modulo25.ExemploVendasMod25.main.dao.IClienteDAO;
import Modulo25.ExemploVendasMod25.main.domain.Cliente;

public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        return clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return clienteDAO.buscarPorCPF(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);
        
    }

}
