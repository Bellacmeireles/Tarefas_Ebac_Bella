package Modulo25.Tarefa.test;

import org.junit.Assert;
import org.junit.Test;

import Modulo25.Tarefa.dao.IProdutoDAO;
import Modulo25.Tarefa.domain.Produto;
import Modulo25.Tarefa.test.dao.ProdutoDaoMock;


public class ProdutoDaoTest {
    
    private IProdutoDAO produtoDAO;
    private Produto produto;

    public ProdutoDaoTest() {
        produtoDAO = new ProdutoDaoMock();
    }

    @Test
    public void pesquisarProdutos() {
        produto = new Produto();
        produto.setNome("Caminhão de Brinquedo");
        produto.setCodigo(682712L);

        produtoDAO.cadastrar(produto);
    }

    @Test
    public void buscarProduto() {
        produto.setNome("Bicicleta");
        produtoDAO.buscar(produto);

        Assert.assertEquals("Bicicleta", produto.getNome());
    }

}
