package Modulo16.padroesParteDois.templatemethods;

public class Advogado extends Trabalhador{

    @Override
    public void executar() {
        System.out.println("Estou de férias");
    }

    @Override
    protected void trabalhar() {

    }

    protected void voltarParaCasa() {
        System.out.println("Voltar para casa de carro");
    }

   
    protected void irAoTrabalho() {
        super.irAoTrabalho();
    }

  
    protected void iniciarRotina() {
        super.iniciarRotina();
    }

   
    protected void levantar() {
        super.levantar();
    }
    
}
