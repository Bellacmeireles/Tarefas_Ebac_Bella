package Modulo25.Tarefa.dao;

import Modulo25.Tarefa.domain.Produto;

public interface IProdutoDao {

    void cadastrar(Produto produto);
    
    Produto buscarProduto(String nome);

    

}
