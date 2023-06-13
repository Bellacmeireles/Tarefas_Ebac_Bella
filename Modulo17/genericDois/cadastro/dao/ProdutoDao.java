package Modulo17.genericDois.cadastro.dao;


import java.util.HashMap;
import java.util.Map;

import Modulo17.genericDois.cadastro.dao.generic.GenericDAO;
import Modulo17.genericDois.cadastro.domain.Produto;

public class ProdutoDao extends GenericDAO<Produto> implements IprodutoDao {

    public ProdutoDao() {
        super();
        Map<Long, Produto> mapaInterno = this.map.get(getTipoClass());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClass(), mapaInterno);
        }
    }

    @Override
    public Class<Produto> getTipoClass() {
        return Produto.class;
    }

    @Override
    public void atualizarDados(Produto entity, Produto entityCadastrado) {

    }

}
