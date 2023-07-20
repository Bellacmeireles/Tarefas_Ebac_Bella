package Modulo25.Tarefa.service;

import Modulo25.Tarefa.domain.Produto;

public interface IProdutoService {

    void cadastrar(Produto produto);

    Produto buscarIDProduto(Long codigo);

    void buscarNomeProduto(String nome);

    void buscarNomeProduto(Produto produto); // vem do metodo -> nomeProdutos2() {}

    


    
    
}
