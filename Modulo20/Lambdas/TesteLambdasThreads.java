package Modulo20.Lambdas;

public class TesteLambdasThreads {
    public static void main(String[] args) {
        Runnable n = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando de forma comum");
            }
        };
        new Thread(n).start();

        Runnable nLambda = () -> System.out.println("Executando com Lambda");
        new Thread(nLambda).start();
  
        new Thread(() -> System.out.println("Executando com Lambda")).start();;
        
    }
}
