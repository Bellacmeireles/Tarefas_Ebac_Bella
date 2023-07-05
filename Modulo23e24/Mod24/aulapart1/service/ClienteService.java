package Modulo23e24.Mod24.aulapart1.service;

//import Modulo23e24.Mod24.aulapart1.dao.ClienteDao;
import Modulo23e24.Mod24.aulapart1.dao.IClienteDAO;

public class ClienteService {

    private IClienteDAO clienteDao;

    public ClienteService(IClienteDAO clienteDao) {
       // clienteDao = new ClienteDao();
       this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();    
        return "Sucesso";
    }  
    
}
