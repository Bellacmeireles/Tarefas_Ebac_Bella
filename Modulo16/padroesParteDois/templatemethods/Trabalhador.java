package Modulo16.padroesParteDois.templatemethods;

public abstract class Trabalhador {

    public void executar() {
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();

    }
    protected abstract void trabalhar();

    private void voltarParaCasa() {
        System.out.println("Voltando para casa");
    }

    protected void irAoTrabalho() {
        System.out.println("Indo trabalhar");
    }

    protected void iniciarRotina() {
        System.out.println("Iniciando Rotina");
    }

    protected void levantar() {
        System.out.println("Levantando da cama");
    }
    
}
