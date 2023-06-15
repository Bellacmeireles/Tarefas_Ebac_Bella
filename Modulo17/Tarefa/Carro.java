package Modulo17.Tarefa;

public abstract class Carro {
    
    private String marca;
    private String eletrico;
    private String motor;
    private String cor;
    private String automático;
    private String manual;
    
    public String getEletrico() {
        return eletrico;
    }
    public void setEletrico(String eletrico) {
        this.eletrico = eletrico;
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
    public String getManual() {
        return manual;
    }
    public void setManual(String manual) {
        this.manual = manual;
    }


}
