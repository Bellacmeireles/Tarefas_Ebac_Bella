package Modulo25.Tarefa.test;

import org.junit.Assert;
import org.junit.Test;

import Modulo25.Tarefa.dao.IProdutoDao;
import Modulo25.Tarefa.domain.Produto;
import Modulo25.Tarefa.service.IProdutoService;
import Modulo25.Tarefa.service.ProdutoService;
import Modulo25.Tarefa.test.dao.ProdutoDaoMock;



public class ProdutoDaoTest {
    
    private IProdutoService produtoService;
    private Produto produto;

    public ProdutoDaoTest() {
        IProdutoDao dao = new ProdutoDaoMock();
        produtoService = new ProdutoService(dao);
        
    }

    @Test
    public void pesquisarProdutos() {
        Produto produto = new Produto();
        produto.setNome("Caminhão de Brinquedo");
        produto.setCodigo(682712L);

        produtoService.cadastrar(produto);

        Produto produtoConsultado = produtoService.buscarProduto(produto.getNome());
        Assert.assertNotNull(produtoConsultado);

    }

    /* @Test
    public void nomeDoProduto() {
        produto.setNome("Bicicleta");
        produtoService.buscar(produto);

        Assert.assertEquals("Bicicleta", produto.getNome());
    } */

}
