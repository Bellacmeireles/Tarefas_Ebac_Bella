package Modulo11e12.TarefaMod11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @see {@code} -> tentandoDeNovo.java
 * Essa classe estava com problemas para compilar porque eu não escrevi os códigos corretamente
 * Criei a classe tentandoDeNovo como uma forma de tentar resolver o problema sem mexer nessa classe, para caso eu conseguisse resolver, poderia então comparar e entender onde errei
 * 
 * 
 */
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

        System.out.println(" ");
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
