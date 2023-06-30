package Modulo20e21.Tarefa;

public class Tarefa {
    public static void main(String[] args) {

        /* Forma Normal */
        Runnable teste1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Forma comum, sem Lambda");
            }
        };
        new Thread(teste1).start();

        /* Agora utilizando Lambda */
        new Thread(() -> System.out.println("Utilazando Lambda")).start();

    }

}