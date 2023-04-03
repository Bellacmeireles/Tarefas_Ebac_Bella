package Modulo11e12.correcaoMod11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Essa classe foi uma tentativa de resolver a atividade MaleAndFemale
 * Nessa clsse se apresenta o código feito da maneira correta
 * 
 */

public class tentandoDeNovo {
    public static void main(String[] args) {

        //List<String> nomes = new ArrayList<>();
        List<String> male = new ArrayList<>();
        List<String> female = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the person's name and gender separated by a hyphen (-) ");

        String entrada = scanner.nextLine();
        String[] partes = entrada.split(", ");

        System.out.println(" ");
        System.out.println("**** List with all names-genders ****");


        for (String pessoas : partes) {
            String[] peopleName = pessoas.split("-");
            String nome = peopleName[0];
            String sexo = peopleName[1];

            if (sexo.equalsIgnoreCase("Female")) {
                female.add(nome);
            } else if (sexo.equalsIgnoreCase("Male")) {
                male.add(nome);
            }
            
            System.out.println(nome + "-" + sexo);
        }

        System.out.println(" ");
        System.out.println("**** Female Group ****");
        for (String nameF : female) {
            System.out.println(nameF + "-" + "Female");
        }

        System.out.println(" ");
        System.out.println("**** Male Group ****");
        for (String nameM : male) {
            System.out.println(nameM + "-" + "Male");
        }

        scanner.close();
    }
}
