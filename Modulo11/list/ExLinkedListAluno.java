package Modulo11.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import Modulo11.domain.Aluno1;
import Modulo11.domain.ComparaNotaAluno;


public class ExLinkedListAluno {
    public static void main(String args[]) {
        exemploListaSimplesOrdenadaComparatorAluno();
        exemploListaSimplesOrdenadaClasseExterna();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna() {
        System.out.println("****** exemploListaSimplesOrdenadaComparatorAluno ******");
        List<Aluno1> lista = new LinkedList<>();

        Aluno1 a = new Aluno1("Pedro Cabral", "Java", 10);
        Aluno1 b = new Aluno1("Kleber Meireles", "Sql", 90);
        Aluno1 c = new Aluno1("Samuel Ribeiro", "HTML e CSS", 80);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        //Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdenadaComparatorAluno() {
        System.out.println("****** exemploListaSimplesOrdenadaComparatorAluno ******");
        List<Aluno1> lista = new LinkedList<Aluno1>();

        Aluno1 a = new Aluno1("Pedro Cabral", "Java", 10);
        Aluno1 b = new Aluno1("Kleber Meireles", "Sql", 90);
        Aluno1 c = new Aluno1("Samuel Ribeiro", "HTML e CSS", 80);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println("Lista sem ordenação" + lista);
        //Collections.sort(lista);
        System.out.println("Lista com ordenação" + lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista, comparaNotaAluno);
        System.out.println("Lista com ordenação por nota" + lista);

        System.out.println("");
    }
}
