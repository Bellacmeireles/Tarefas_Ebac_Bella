package Modulo17.genericDois.cadastro.dao;

import java.util.HashMap;
import java.util.Map;

/* import java.util.HashMap;
import java.util.Map;
 */
/* import java.util.Collection;
import java.util.HashMap;
import java.util.Map; */

import Modulo17.genericDois.cadastro.dao.generic.GenericDAO;
import Modulo17.genericDois.cadastro.domain.Cliente;

public class ClienteMapDao extends GenericDAO<Cliente> implements IClienteDao {

    public ClienteMapDao() {
        super();
        Map<Long, Cliente> mapaInterno = this.map.get(getTipoClass());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClass(), mapaInterno);
        }

    }

    @Override
    public Class<Cliente> getTipoClass() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setTel(entity.getTel());
        entityCadastrado.setNumero(entity.getNumero());
        entityCadastrado.setEnd(entity.getEnd());
        entityCadastrado.setCidade(entity.getCidade());
        entityCadastrado.setEstado(entity.getEstado());
    }

    /*
     * private Map<Long, Cliente> map;
     * 
     * 
     * public ClienteMapDao() {
     * this.map = new HashMap<>();
     * }
     * 
     * @Override
     * public Boolean cadastrar(Cliente cliente) {
     * if (this.map.containsKey(cliente.getCpf())) {
     * return false;
     * }
     * this.map.put(cliente.getCpf(), cliente);
     * return true;
     * }
     * 
     * @Override
     * public void excluir(Long cpf) {
     * Cliente clienteCadastrado = this.map.get(cpf);
     * 
     * if (clienteCadastrado != null) {
     * this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
     * }
     * }
     * 
     * @Override
     * public void alterar(Cliente cliente) {
     * Cliente clienteCadastrado = this.map.get(cliente.getCpf());
     * if (clienteCadastrado != null) {
     * cliente.setNome(cliente.getNome());
     * cliente.setTel(cliente.getTel());
     * cliente.setNumero(cliente.getNumero());
     * cliente.setEnd(cliente.getEnd());
     * cliente.setCidade(cliente.getCidade());
     * cliente.setEstado(cliente.getEstado());
     * }
     * }
     * 
     * @Override
     * public Cliente consultar(Long cpf) {
     * return this.map.get(cpf);
     * }
     * 
     * @Override
     * public Collection<Cliente> buscarTodos() {
     * return this.map.values();
     * }
     */

}
