package Modulo25.Tarefa.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Modulo25.Tarefa.dao.IProdutoDao;

import Modulo25.Tarefa.domain.Produto;
import Modulo25.Tarefa.test.dao.ProdutoDaoMock;

public class ProdutoDaoTest {

    /**
     * e aqui se testa só o DAO
     */

    private IProdutoDao produtoDao;
    private Produto produto;

    public ProdutoDaoTest() {
        produtoDao = new ProdutoDaoMock();
    }

    @Before
    public void init() {
        produto = new Produto();
        produto.setNome("Caminhão de Brinquedo");
        produto.setCodigo(682712L);

        produtoDao.cadastrar(produto);
    }

    @Test
    public void pesquisarProdutos() {

        Produto produtoConsultado = produtoDao.buscarIDProduto(produto.getCodigo());
        Assert.assertNotNull(produtoConsultado);
    }

    @Test
    public void nomeProdutos() {
        produtoDao.buscarNomeProduto(produto.getNome());

        /* Produto produtoNomes = produtoDao.buscarNomeProduto(produto.getNome());
        Assert.assertEquals(produtoNomes, produtoNomes); */
    }

}
