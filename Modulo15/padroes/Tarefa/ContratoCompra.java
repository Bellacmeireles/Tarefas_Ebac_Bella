package Modulo15.padroes.Tarefa;

public class ContratoCompra {
    public static void main(String[] args) {
        Comprador cliente = new Comprador("A", "B");
        Fabrica fab = getFabrica(cliente);
        Carro car = fab.carroZero(cliente.carroNovo());
        car.startEngine();  
        
        System.out.println();

        Loja loja = getLoja(cliente);
        CarroSemi carroSemi = loja.carroSemi(cliente.semiNovo());
        carroSemi.startEngine();
        System.out.println();
    }

    private static Loja getLoja(Comprador cliente) {
        return new CompraCarroSemiNovo();
    }

    private static Fabrica getFabrica(Comprador cliente) {
        return new CompraCarroZero();
    }

}
