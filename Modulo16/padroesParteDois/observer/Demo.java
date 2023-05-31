package Modulo16.padroesParteDois.observer;

public class Demo {
    public static void main(String[] args) {
        Jornalista jor = new Jornalista();
        jor.add(new Tv());
        jor.notifyAll("Teste");
    }
}
