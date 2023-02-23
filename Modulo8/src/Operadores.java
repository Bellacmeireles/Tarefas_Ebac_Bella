package Modulo8.src;

public class Operadores {
    public static void main(String[] args) {
        operacoesAritimeticas();
        operacoesAtribuições();
        operacoesIncrementoDecremento();
        operacoesRelacionais();
        operacoesLógicas();
    }
    
    public static void operacoesLógicas() {
        int num1 = 10;

        boolean isDentro10 = num1 >= 1 && num1 <= 10;
        System.out.println("Dentro10:" + isDentro10);

        boolean isDentro_10 = num1 >= 1 || num1 <= 10;
        System.out.println("Dentro10:" + isDentro_10);

        boolean isNot = num1 >= 1;
        System.out.println("Not:" + !isNot);
    }

    public static void operacoesRelacionais() {
        System.out.println("*** operacoesRelacionais ***");

        int num1 = 10;
        int num2 = 10;
        boolean isMaior = num1 > num2;
        System.out.println("Maior:" + isMaior);
        
        boolean isIgual = num1 == num2;
        System.out.println("Igual:" + isIgual);

        boolean isDiferente = num1 != num2;
        System.out.println("Diferente:" + isDiferente);

        boolean isMaiorIgual = num1 >= num2;
        System.out.println("MaiorIgual:" + isMaiorIgual);

    }

    public static void operacoesIncrementoDecremento() {
        System.out.println("*** operacoesIncrementoDecremento ***");

        int num1 = 10;
        System.out.println(num1);
        
        num1++;
        System.out.println(num1);
        
        num1--;
        System.out.println(num1);

    }

    public static void operacoesAritimeticas() {
        System.out.println("*** operacoesAritimeticos ***");
        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 * num2;
        int num6 = num1 / num2;
        int num7 = (10 + 10) /2;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
    }

    public static void operacoesAtribuições() {
        System.out.println("*** operacoesAtribuições ***");
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;

        System.out.println(numero3);

        numero3 += numero3;
        
        System.out.println(numero3);

    }

}
