package Modulo17.Tarefa;

public class Hillux extends Carro{
    private String marca;
    private String motor;
    private String manual;
    private String cor;
    private String flex;

    public String getFlex() {
        return flex;
    }
    public void setFlex(String flex) {
        this.flex = flex;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public String getManual() {
        return manual;
    }
    public void setManual(String manual) {
        this.manual = manual;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String imprimirListaH() {
        return  marca + " Hillux | " + motor + ": " + manual + " | Versão: " + flex + " | de Cor: " + cor ;
    }

    public static void imprimirHillux() {
        System.out.println("Marca: Hillux " + "Motor: Flex versão: Manual " + "de cor Prata está pronto para retirar!");
    }

}
