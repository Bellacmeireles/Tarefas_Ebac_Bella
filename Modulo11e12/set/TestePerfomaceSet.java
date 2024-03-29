package Modulo11e12.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

import Modulo11e12.domain.Aluno1;

public class TestePerfomaceSet {
    public static void main(String args[]) {
        Random r = new Random();

        HashSet<Aluno1> hashSet = new HashSet<Aluno1>();
        TreeSet<Aluno1> treeSet = new TreeSet<Aluno1>();
        LinkedHashSet<Aluno1> linkedSet = new LinkedHashSet<Aluno1>();

        // start time
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            hashSet.add(new Aluno1("João da Silva", "Linux básico", x));
        }
        // end time
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("HashSet: " + duration);

        // start time
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            treeSet.add(new Aluno1("João da Silva", "Linux básico", x));
        }
        // end time
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("TreeSet: " + duration);

        // start time
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            linkedSet.add(new Aluno1("João da Silva", "Linux básico", x));
        }
        // end time
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("LinkedHashSet: " + duration);
    }
}
