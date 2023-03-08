package Modulo11.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * É como um array cujo tamanho pode crsecer.
 * A busca de um elemento é rápida, mas inserções e exclusões não são!
 * 
 */
public class ExArrayList {
    
    public static void main(String[] args) {
        exemploNumeros();
        exemploSimples();
        exemploSimplesOrdemAscendente();
    }

    private static void exemploNumeros() {
        System.out.println("****** exemploNumeros ******");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        System.out.println(numeros);
    }

    private static void exemploSimples() {
        System.out.println("****** exemploSimples ******");
        List<String> lista = new ArrayList<String>();
        lista.add("Samuel Meireles");
        lista.add("Kleber Ribeiro");
        lista.add("Telma Cabral");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploSimplesOrdemAscendente() {
        System.out.println("****** exemploListaSimplesOrdemAscendente ******");
        List<String> lista = new ArrayList<String>();
        lista.add("Samuel Meireles");
        lista.add("Kleber Ribeiro");
        lista.add("Telma Cabral");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

}