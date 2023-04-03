package Modulo13.interfacess;
/**
 * interface ele não tem método que tem corpo, é só assinatura do método.
 * 
 */

public interface ICaneta {
    
    public void escrever(String texto);

    public String getCor();

    default void escreverComumATodas() {
        System.out.println("Escrita igual a todas");
    }
}
