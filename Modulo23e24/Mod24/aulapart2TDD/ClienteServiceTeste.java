package Modulo23e24.Mod24.aulapart2TDD;

import org.junit.Assert;
import org.junit.Test;

import Modulo23e24.Mod24.aulapart1.dao.ClienteDao;
import Modulo23e24.Mod24.aulapart1.dao.ClienteDaoMock;
import Modulo23e24.Mod24.aulapart1.dao.IClienteDAO;
import Modulo23e24.Mod24.aulapart1.service.ClienteService;

public class ClienteServiceTeste {

    @Test
    public void salvarTeste() {
        IClienteDAO mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDAO mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
