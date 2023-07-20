package Modulo25.Tarefa.test.dao;



import Modulo25.Tarefa.dao.IProdutoDao;
import Modulo25.Tarefa.domain.Produto;

public class ProdutoDaoMock implements IProdutoDao {

    @Override
    public void cadastrar(Produto produto) {
        
        
    }

    @Override
    public Produto buscarIDProduto(Long codigo) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        return produto;
    }

    @Override
    public void buscarNomeProduto(String nome) {
        
    }

    @Override
    public void buscarNomeProduto(Produto produto) {
        
    }

    


}
