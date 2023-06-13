package Modulo17.genericDois.cadastro.dao.generic;

import java.util.Collection;

import Modulo17.genericDois.cadastro.domain.Persistente;

public interface IGenericDAO<T extends Persistente> {

    public Boolean cadastrar(T entity);

    public void excluir(long valor);

    public void alterar(T entity);

    public T consultar(long valor);

    public Collection<T> buscarTodos();

}
