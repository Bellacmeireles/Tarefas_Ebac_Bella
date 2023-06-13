package Modulo17.generic.ExeGeneric;

import java.util.ArrayList;
import java.util.List;

import Modulo17.generic.ExeGeneric.fruta.Banana;
import Modulo17.generic.ExeGeneric.fruta.Fruta;
import Modulo17.generic.ExeGeneric.fruta.Maca;

public class ExJavaGeneric {
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        lista.add("Aprender Java");
        lista.add("1");
        imprimir(lista);

        List<Long> listaLong = new ArrayList<>();
        listaLong.add(19l); 
        listaLong.add(18l);
        imprimir(listaLong); 

        String primeiroSt = pegarPrimeiroLista(lista);
        System.out.println(primeiroSt);

        Long primeiroLong = pegarPrimeiroLista(listaLong);
        System.out.println(primeiroLong);

        Long primeiroLong2 = pegarPrimeiroListaLong(listaLong);
        System.out.println(primeiroLong2);

        imprimir2(listaLong);

        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Maca());
        frutas.add(new Banana());
        imprimirFrutas(frutas);
    }
    /**
     * esse é o wildcard q vc recebe qualquer objeto q extends de outro: "<? extends Fruta>" 
     
     Vc quer criar algo generico mas não tão generic, "UM GENERIC DENTRO DO SEU CONTROLE"
     */ 

    public static void imprimirFrutas(List<? extends Fruta> lista) {
        for (Fruta fruta : lista) {
            System.out.println(fruta);
        }
    }
    
    /**
     * esse é o wildcard: "<?>"
     não precisa passar o generico, ele vai receber qualquer coisa
     */
    public static void imprimir2(List<?> lista) {
        for (Object st : lista) {
            if (st instanceof Long) {
                Long stLong = (Long) st;
                System.out.println(stLong);
            }
            System.out.println("Qualquer coisa: " + st);
        }
    }

    /* -criei um método generico para imprimir alogo generico - Professor aula 1 mod 17 - min 13:20 
     * com esse método eu nao precisei criar duas funcoes tipo "imprimir1 e imprimir2" para imprimir os resultados. Fiz logo um generic q pegasse os dois
    */
    public static <T> void imprimir(List<T> lista) {
        for (T st : lista) {
            System.out.println(st);
        }
    }

    public static <T> T pegarPrimeiroLista(List<T> lista) {
        return lista.get(0);
    }

    public static <T> Long pegarPrimeiroListaLong(List<T> lista) {
        return (Long) lista.get(0);
    }

}
