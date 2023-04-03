package Modulo11e12.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Seus elementos são iterados na ordem em que foram inseridos.
 *
*/

public class ExLinkedHashSet {
    public static void main(String args[]) {
        exemploListaSimples();
    }

    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        Set<String> lista = new LinkedHashSet<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        
    }
}