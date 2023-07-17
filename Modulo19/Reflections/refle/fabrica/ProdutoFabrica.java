package Modulo19.Reflections.refle.fabrica;

import Modulo19.Reflections.refle.domain.Persistente;
import Modulo19.Reflections.refle.domain.Produto;
import Modulo19.Reflections.refle.exception.DadosInvalidosException;

public class ProdutoFabrica implements FabricaPersistente {

    @Override
    public Persistente criarObjeto(String[] dados) throws DadosInvalidosException {
        try {
            Produto produto = new Produto();
            produto.setCodigo(Long.parseLong(dados[0].trim()));
            produto.setNome(dados[1]);
            return produto;
        } catch(IndexOutOfBoundsException e) {
            throw new DadosInvalidosException("Dados de produto estão inválidos");
        }
    }

}
