package Modulo15.padroes.Tarefa;

public class CompraCarroZero extends Fabrica {

    @Override
    Carro montaCarro(boolean comprado) {
        if ("A".equals(comprado)) {
            return new HilluxCar("Motoe de 120 Cavalos", "Prata", "Tanque");
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