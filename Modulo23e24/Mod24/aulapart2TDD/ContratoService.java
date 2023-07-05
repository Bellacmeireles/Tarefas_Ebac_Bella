package Modulo23e24.Mod24.aulapart2TDD;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
        /* throw new UnsupportedOperationException("Unimplemented method 'salvar'"); */
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Buscando Cliente";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Cliente Deletado";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Dados atualizados com sucesso";
    }

}
