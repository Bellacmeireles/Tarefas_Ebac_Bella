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
        double nota2 = 7;
        double nota3 = 8;
        double nota4 = 9.75;   
    
        double notaSoma4 = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Grade point average:" + " " + notaSoma4);

    }
}
