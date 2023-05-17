package Modulo15.padroes.Tarefa;

public class CompraCarroSemiNovo extends Loja {

    @Override
    CarroSemi montaCarro(String compradoS) {
        if("B".equals(compradoS)) {
            return new OnixCar("100Cavalos", "Branco", "Cheio");
        } else {
            return null;
        }
    }
    
}
