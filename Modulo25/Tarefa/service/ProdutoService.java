package Modulo25.Tarefa.service;

import Modulo25.Tarefa.dao.IProdutoDao;

import Modulo25.Tarefa.domain.Produto;

public class ProdutoService implements IProdutoService {

    /**
     * aqui se testa coisas de validação + o DAO
     */

    private IProdutoDao produtoDao;

    public ProdutoService(IProdutoDao produtoDao) {
        this.produtoDao = produtoDao;
    }

    @Override
    public void cadastrar(Produto produto) {
        produtoDao.cadastrar(produto);
    }

    @Override
    public Produto buscarIDProduto(Long codigo) {
    
        return produtoDao.buscarIDProduto(codigo);
    
    }

    @Override
    public void buscarNomeProduto(String nome) {
        produtoDao.buscarNomeProduto(nome);
    }

    @Override
    public void buscarNomeProduto(Produto produto) {
        produtoDao.buscarNomeProduto(produto);
    }

    


    
    
}
