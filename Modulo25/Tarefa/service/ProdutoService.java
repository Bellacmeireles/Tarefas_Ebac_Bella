package Modulo25.Tarefa.service;

import Modulo25.Tarefa.dao.IProdutoDao;

import Modulo25.Tarefa.domain.Produto;

public class ProdutoService implements IProdutoService {

    private IProdutoDao produtoDao;

    public ProdutoService(IProdutoDao produtoDao) {
        this.produtoDao = produtoDao;
    }

    @Override
    public void cadastrar(Produto produto) {
        produtoDao.cadastrar(produto);
    }

    @Override
    public Produto buscarProduto(String nome) {
    
        return produtoDao.buscarProduto(nome);
    
    }

    


    
    
}
