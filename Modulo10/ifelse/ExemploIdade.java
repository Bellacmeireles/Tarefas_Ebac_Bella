package Modulo10.ifelse;

import java.util.Scanner;

public class ExemploIdade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Gigite sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);

        s.close();

        //Ao escrever o código igual o professor, percebir o "Resource leak: 's' is never closed" no Scanner s = new Scanner(System.in);
        // Encontrei duas formas de resolver, um proposto pelo vscode que era usar o try e ficaria assim -> try (Scanner s = new Scanner(System.in)) {} e aouta maneira que encotrei na internet era usar o .close(); no final do código -> s.close();
        // Qual Maneira de resolver é a correta e pq do erro? 
    }

    public static String getIdade(int idade) {
        if (idade >=0 && idade <=5) {
            return "Você é um bebê";
        } else if (idade >=6 && idade <=10) {
            return "Você é criança";
        } else if (idade >=11 && idade <=18) {
            return "Você é adolescente";
        } else {
            return "Você é adulto";
        }
    }
}
