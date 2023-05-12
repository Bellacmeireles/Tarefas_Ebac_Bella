package Modulo15.padroes.Tarefa;

public abstract class Loja {
    
    public CarroSemi carroSemi(String compradoS) {
        CarroSemi carroSemi = montaCarro(compradoS);
        carroSemi = compraSemi(carroSemi);
        return carroSemi;
    }

    private CarroSemi compraSemi(CarroSemi carroSemi) {
        carroSemi.limpaS();
        carroSemi.mecanicaS();
        carroSemi.tanqueS();
        return carroSemi;
    }

    abstract CarroSemi montaCarro(String compradoS);
}
