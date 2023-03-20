package Modulo11.TarefaMod11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaleAndFemale {
    public static void main(String[] args) {
        List<String> femininos = new ArrayList<>();
        List<String> masculinos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa e o sexo separados por um hífen (-) ");

        String entrada = scanner.nextLine();
        String[] partes = entrada.split(", ");

        String nome = partes[0].trim();
        String sexo = partes[1].trim();

        if (sexo.equalsIgnoreCase("Feminino")) {
            femininos.add(nome);
        } else if (sexo.equalsIgnoreCase("Masculino")) {
            masculinos.add(nome);
        }
        System.out.println(nome + sexo);

        System.out.println("**** Grupo Feminino ****");
        for (String nomeF : femininos) {
            System.out.println(nomeF);
        }

        System.out.println(" ");

        System.out.println("**** Grupo Masculino ****");
        for (String nomeM : masculinos) {
            System.out.println(nomeM);
        }

        scanner.close();
    }

}
