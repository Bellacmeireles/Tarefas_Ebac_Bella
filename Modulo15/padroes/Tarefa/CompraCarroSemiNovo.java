package Modulo15.padroes.Tarefa;

public class CompraCarroSemiNovo extends Loja {

    @Override
    CarroSemi montaCarro(String compradoS) {
        if("Carro Semi Novo".equals(compradoS)) {
            return new OnixCar("100Cavalos", "Branco", "Cheio");
        } else {
            return null;
        }
    }
    
}
