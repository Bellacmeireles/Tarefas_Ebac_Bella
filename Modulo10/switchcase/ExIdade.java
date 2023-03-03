package Modulo10.switchcase;

import java.util.Scanner;

public class ExIdade {
    public class ExemploIdade {

        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
    
            System.out.println("Digite sua idade: ");
            int idade = s.nextInt();
            String idadeSt = getIdade(idade);
            System.out.println(idadeSt);

            s.close();
        }
    
        public static String getIdade(int idade) {
            String result;
            switch (idade) {
                case 0:
                case 5:
                    result = "Você é um bebê";
                    break;
                case 6:
                case 10:
                    result = "Você é uma criança";
                    break;
                case 11:
                case 18:
                    result = "Você é adolescente";
                    break;
                default:
                    result = "Você é adulto";
                    break;
            }
            return result;
        }
    
    
    }    
}
