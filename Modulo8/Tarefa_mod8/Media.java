package Modulo8.Tarefa_mod8;
/**
 * Crie um programa que faça a leitura de 4 notas.
 * Divida por 4 e obtenha a media de cada uma.
 */
public class Media {
    private int nota;

    public int getnota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }

    public static void main(String[] args) {
        double nota1 = 6.5;
        int nota2 = 7;
        int nota3 = 8;
        double nota4 = 9.75;   
    
        nota1 = (nota1 / 4);
        nota2 = (nota2 / 4);
        nota3 = (nota3 / 4);
        nota4 = nota4 / 4;

        System.out.println("Média nota1:" + " " + nota1);
        System.out.println("Média nota2:" + " " +nota2);
        System.out.println("Média nota3:" + " " +nota3);
        System.out.println("Média nota4:" + " " +nota4);
    }
}
