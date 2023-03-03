package Modulo10.TarefaMod10;

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double nota1 = 6;
        double nota2 = 7;
        double nota3 = 8;
        double nota4 = 9;   
    
        double notaSoma4 = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua nota é:" + " " + notaSoma4);   
        
        /**
         * O código comentado abaixo foi uma opção que encontrei para que o programa não desse erro caso eu colocasse "." ao invés de ","
         * Quando habilitado, ele converte o "." para "," automaticamente.
         * Caso desabilitado, ele só irá ler o número decimal se estiver com a (",") e caso eu coloque o ponto sem perceber, isso ocasionará em java.util.InputMismatchException.
         */

        System.out.println("Para saber seu status final digite sua nota: ");
        /*String entrada = s.next().replace(",", ".");
        double nota = Double.parseDouble(entrada);*/
        double nota = s.nextDouble();
        String notaBm = getNota(nota);
        System.out.println(notaBm);

        s.close();
    }

    public static String getNota(Double nota) {
        if (nota >=7) {
            return "Aluno Aprovado";
        } else if (nota >=5) {
            return "Aluno em Recuperação";
        } else {
            return "Aluno Reprovado";
        }
    }
}
