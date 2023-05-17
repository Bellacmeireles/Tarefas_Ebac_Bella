package Modulo15.padroes.Tarefa;

public class Comprador {
    
    private boolean carroNovo;
    private boolean semiNovo;

    public Comprador(boolean carroNovo, boolean semiNovo) {
        this.carroNovo = carroNovo;
        this.semiNovo = semiNovo;
    }

    public boolean carroNovo() {
        return carroNovo;
    }
    public boolean semiNovo() {
        return semiNovo;
    }
}
