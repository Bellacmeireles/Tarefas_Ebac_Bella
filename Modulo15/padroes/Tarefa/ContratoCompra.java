package Modulo15.padroes.Tarefa;

public class ContratoCompra {
    public static void main(String[] args) {
        Comprador cliente = new Comprador(true, false);
        Fabrica fab = getFabrica(cliente);
        Carro car = fab.carroZero(cliente.carroNovo());
        car.startEngine();  
      
    }

    

    private static Fabrica getFabrica(Comprador cliente) {
        if (cliente.carroNovo()) {
            return new CompraCarroZero();
        } else if (cliente.semiNovo()) {
            return new CompraCarroSemiNovo() ;
        }
    }
    

    
}
