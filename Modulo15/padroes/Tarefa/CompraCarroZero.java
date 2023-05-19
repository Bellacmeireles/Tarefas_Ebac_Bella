package Modulo15.padroes.Tarefa;

public class CompraCarroZero extends Fabrica {

    @Override
    Carro montaCarro(String comprado) {
        if ("A".equals(comprado)) {
            return new HilluxCar("Motor de 120 Cavalos", "Prata", "Tanque");
        } else {
            return null;
        }
    }
    
}
