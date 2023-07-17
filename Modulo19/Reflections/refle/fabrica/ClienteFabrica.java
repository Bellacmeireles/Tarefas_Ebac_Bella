package Modulo19.Reflections.refle.fabrica;

import Modulo19.Reflections.refle.domain.Cliente;
import Modulo19.Reflections.refle.domain.Persistente;
import Modulo19.Reflections.refle.exception.DadosInvalidosException;

public class ClienteFabrica implements FabricaPersistente {

    @Override
    public Persistente criarObjeto(String[] dadosSeparados) throws DadosInvalidosException {
        try {
            return new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]) ;
        } catch(IndexOutOfBoundsException e) {
            throw new DadosInvalidosException("Dados de cliente estão inválidos");
        }
    }
    
}
