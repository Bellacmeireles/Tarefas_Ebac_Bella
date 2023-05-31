package Modulo16.padroesParteDois.templatemethods;

public class Policial extends Trabalhador {

    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como Policial");
    }

    protected void levantar() {
        System.out.println("Levantando da cama as 08");
    }
    
}
