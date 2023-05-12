package Modulo15.padroes.Tarefa;

public abstract class Fabrica {
    
    public Carro carroZero(String comprado) {
        Carro carro = montaCarro(comprado);
        carro = entregaCarro(carro);
        return carro;
    }

    private Carro entregaCarro(Carro carro) {
        carro.limpa();
        carro.mecanica();
        carro.tanque();
        return carro;
    }

    abstract Carro montaCarro(String comprado);
    
}
