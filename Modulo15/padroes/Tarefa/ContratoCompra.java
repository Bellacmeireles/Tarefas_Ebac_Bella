package Modulo15.padroes.Tarefa;

public class ContratoCompra {
    public static void main(String[] args) {
        Comprador cliente = new Comprador("A", "B");
        Fabrica fabrica = getFabrica(cliente);
        Carro carro = fabrica.carroZero(cliente.carroNovo());
        

        Comprador cliente1 = new Comprador("B", "C");
        Loja fabrica1 = getLoja(cliente);
        CarroSemi carroSemi = fabrica1.carroSemi(cliente.carroNovo());
        
    }

    private static Loja getLoja(Comprador cliente) {
        return null;
    }

    private static Fabrica getFabrica(Comprador cliente) {
        if (cliente.carroNovo()) {
            return new CompraCarroZero();
        } else {
            return new CompraCarroSemiNovo();
        }
        
    }
}
