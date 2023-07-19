package Modulo25.Tarefa.test.dao;



import Modulo25.Tarefa.dao.IProdutoDao;
import Modulo25.Tarefa.domain.Produto;

public class ProdutoDaoMock implements IProdutoDao {

    @Override
    public void cadastrar(Produto produto) {
        
        
    }

    @Override
    public Produto buscarProduto(String nome) {
        Produto produto = new Produto();
        produto.setNome(nome);
        return produto;
    }

    


}
