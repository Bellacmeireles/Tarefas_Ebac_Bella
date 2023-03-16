package Modulo11.TarefaParte2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Parte2 {
    public static void main(String[] args) {
        namesSortAndGender();
    }

    private static void namesSortAndGender() {
        System.out.println("****** Group of .sort(); ******");
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 2 female and 2 male names, separated by , ");

        String name = s.nextLine();
        String[] names = name.split(",");
        // System.out.println(name);
        // linha de cima foi comentada para não repetir os nomes 2x

        // Put the names in alphabetical order
        List<String> people = Arrays.asList(names);
        Collections.sort(people);
        System.out.println(people);

        System.out.println("");

        System.out.println("****** Group by Genders ******");
        System.out.println("write 2 female names and 2 male names, each with -female/male ");

        String nome = s.nextLine();
        String[] names1 = nome.split(",");
        System.out.println("");

        for (String peolples : names1) {
            String[] peopleName = peolples.split("-");
            String name1 = peopleName[0];
            String gender = peopleName[1];

            System.out.println("Name: " + name1 + ", " + "Gender: " + gender);
            System.out.println("");

            s.close();
        }
    }
}
