package Modulo16.padroesParteDois.observer;

public class Tv implements Observer{

    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a notica via TV" + subject.toString());
    }
    
}
