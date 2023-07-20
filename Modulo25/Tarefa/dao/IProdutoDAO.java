package Modulo25.Tarefa.dao;

import Modulo25.Tarefa.domain.Produto;

public interface IProdutoDao {

    void cadastrar(Produto produto);
    
    Produto buscarIDProduto(Long codigo);

    void buscarNomeProduto(String nome);

    void buscarNomeProduto(Produto produto); // vem do metodo -> nomeProdutos2() {}

    

}
