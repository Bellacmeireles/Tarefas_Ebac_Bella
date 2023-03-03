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
