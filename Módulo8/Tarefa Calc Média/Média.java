/**
 * Tarefa Mód 8
 * Crie um programa que faça a leitura de 4 notas e depois divida por 4 para obter a média.
 */
public class Média {

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

        System.out.println(nota1);
        System.out.println(nota2);
        System.out.println(nota3);
        System.out.println(nota4);
    }
    
}
    