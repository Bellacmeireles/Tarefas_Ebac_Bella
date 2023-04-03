package Modulo13.interfacess;

public interface Icarro {
    default void parar() {
        System.out.println("Carro está parando");
    }
    
    public void andar();
}
