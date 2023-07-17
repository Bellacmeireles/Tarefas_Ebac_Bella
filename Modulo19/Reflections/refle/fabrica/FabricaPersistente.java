package Modulo19.Reflections.refle.fabrica;

import Modulo19.Reflections.refle.domain.Persistente;
import Modulo19.Reflections.refle.exception.DadosInvalidosException;

public interface FabricaPersistente {
    /**
     Método que sabe criar objetos da aplicação
     *
     * @param dados São os dados a serem cadastrados no banco de dados
     * @return Retorna o objeto <b>Persistente</b> que é pai de todas as entidades da aplicação
     * @throws DadosInvalidosException quando os dados estão inválidos
     */

    Persistente criarObjeto(String dados[]) throws DadosInvalidosException;

}
