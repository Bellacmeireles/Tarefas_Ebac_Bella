package Modulo17.genericDois.cadastro.dao.generic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import Modulo17.genericDois.cadastro.domain.Persistente;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T>{

    protected Map<Class<?>, Map<Long, T>> map;

    public abstract Class<T> getTipoClass();
    public abstract void atualizarDados(T entity, T entityCadastrado);

    public GenericDAO() {
        this.map = new HashMap<>();   
        Map<Long, T> mapaInterno = this.map.get(getTipoClass());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClass(), mapaInterno);
        }
    }

    @Override
    public void alterar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClass());
        T objetoCadastrado = mapaInterno.get(entity.getCodigo());
        if (objetoCadastrado != null) {
            atualizarDados(entity, objetoCadastrado);
        }
    }

    @Override
    public Collection<T> buscarTodos() {
        Map<Long, T> mapaInterno = this.map.get(getTipoClass());
        return mapaInterno.values();
    }

    @Override
    public Boolean cadastrar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClass());
        if (mapaInterno.containsKey(entity.getCodigo())) {
            return false;
        }
        mapaInterno.put(entity.getCodigo(), entity);
        return true;
    }

    @Override
    public T consultar(long valor) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClass());
        return mapaInterno.get(valor);
    }

    @Override
    public void excluir(long valor) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClass());
        T objetoCadastrado = mapaInterno.get(valor);
        if (objetoCadastrado != null) {
            this.map.remove(valor, objetoCadastrado);
        }
    }

}
