package Modulo23e24.Mod24.aulapart2TDD;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona sem o banco");
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Cliente não encontrado");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Não foi possível excluir cliente, entre em contato com o suporte.");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Não foi possível atualizar dados do cliente, entre em contato com o suporte.");
    }


}
