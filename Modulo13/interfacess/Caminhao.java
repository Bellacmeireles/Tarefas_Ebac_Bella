package Modulo13.interfacess;

public class Caminhao implements Icarro{

    @Override
    public void andar() {
        System.out.println("Caminhão está andando de vagar");
    }
    
    
    @Override
    public void parar() {
        System.out.println("Caminhão parando");
    }
}
