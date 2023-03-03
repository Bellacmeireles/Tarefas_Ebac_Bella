package Modulo10.forewhile;

import java.util.ArrayList;
import java.util.List;

public class ExemploPPT1 {
    public static void main(String args[]) {
        List<Integer> valores = new ArrayList<>();
        for(int i = 0; i <= 10; i++) {
            System.out.println("Linha " + i);
            valores.add(i);
        }
        // for normal de java, que usa contador e sabe a quantidade de registros que tem dentro

        for (Integer i : valores) {
            System.out.println("Linha " + i);
        }
        // for que usa coleções e vc não sabe a quanrtidade de registros que tem dentro

        valores.forEach(i-> System.out.println("Linha " + i));
        // for mais aprimorado em lambda

    }
}
