/**
 * javadoc 
 * 
 * 
 */
package Modulo7.src;

public class PrimeiraClasse {
    
    public static void main(String[] args) {
        System.out.println("Olá Bella");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereço("Rua 1");
        cliente.setCódigo(1);

        System.out.println(cliente.getCódigo());

        //cliente.imprimirEndereço();
        //String end = cliente.retornaNomeCliente();

        System.out.println(cliente.retornaNomeCliente());
        System.out.println(cliente.valorTotal());
    }
}