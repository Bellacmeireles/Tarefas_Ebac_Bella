package Modulo15.padroes.Tarefa;

public class CompraCarroZero extends Fabrica {

    @Override
    Carro montaCarro(String comprado) {
        if ("Carro Novo".equals(comprado)) {
            return new HilluxCar("120Cavalos", "Prata", "Cheio");
        } else {
            return null;
        }
    }
    
}

/**
 * parei com a vertente de carro novo pronta
 * falta a vertente de semi novos
 * e depois criar o Demo = contratosCompraRealizada, que tera as duas vertentes 
 */