package Modulo15.padroes.Tarefa;

public class Comprador {
    
    private String carroNovo;
    private String semiNovo;

    public Comprador(String carroNovo, String semiNovo) {
        this.carroNovo = carroNovo;
        this.semiNovo = semiNovo;
    }

    public String carroNovo() {
        return carroNovo;
    }
    public String semiNovo() {
        return semiNovo;
    }
}
