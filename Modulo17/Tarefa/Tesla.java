package Modulo17.Tarefa;

public class Tesla extends Carro{
    private String marca;
    private String eletrico;
    private String motor;
    private String cor;
    private String automático;

    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getEletrico() {
        return eletrico;
    }
    public void setEletrico(String eletrico) {
        this.eletrico = eletrico;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getAutomático() {
        return automático;
    }
    public void setAutomático(String automático) {
        this.automático = automático;
    }


    public String imprimirListaT() {
        return  marca + " Tesla | " + motor + ": " + eletrico + " | Versão: " + automático + " | de Cor: " + cor ; 
    }

    public static void imprimirTesla() {
        System.out.println("Marca: Tesla " + "Motor: Elétrico versão: Automático " + "de cor Branca está pronto para retirar!");
    }
    
}
