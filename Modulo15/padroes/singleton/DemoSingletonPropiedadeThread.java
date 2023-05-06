package Modulo15.padroes.singleton;

public class DemoSingletonPropiedadeThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadFoo());
        Thread t2 = new Thread(new ThreadBar());
        t1.start();
        t2.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonComPropriedade singleton = SingletonComPropriedade.getInstance("Teste");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonComPropriedade singleton = SingletonComPropriedade.getInstance("Teste1");
            System.out.println(singleton.getValue());
        }
    }

}
