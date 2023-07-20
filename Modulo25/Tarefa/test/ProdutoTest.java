package Modulo25.Tarefa.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Modulo25.Tarefa.dao.IProdutoDao;
import Modulo25.Tarefa.domain.Produto;
import Modulo25.Tarefa.service.IProdutoService;
import Modulo25.Tarefa.service.ProdutoService;
import Modulo25.Tarefa.test.dao.ProdutoDaoMock;



public class ProdutoTest {
    
    private IProdutoService produtoService;
    private Produto produto;

    public ProdutoTest() {
        IProdutoDao dao = new ProdutoDaoMock();
        produtoService = new ProdutoService(dao);
        
    }

    @Before
    public void init() {
        produto = new Produto();
        produto.setNome("Caminhão de Brinquedo");
        produto.setCodigo(682712L);

        produtoService.cadastrar(produto);
    }

    @Test
    public void pesquisarProdutos() {

        Produto produtoConsultado = produtoService.buscarIDProduto(produto.getCodigo());
        Assert.assertNotNull(produtoConsultado);
    }

    @Test
    public void nomeProdutos() {
        produtoService.buscarNomeProduto(produto.getNome());
    }

    @Test
    public void nomeProdutos2() {

        produto.setNome("Boneco da Marvel");
        produtoService.buscarNomeProduto(produto);

        Assert.assertEquals("Boneco da Marvel", produto.getNome());
        
    }

    

}
