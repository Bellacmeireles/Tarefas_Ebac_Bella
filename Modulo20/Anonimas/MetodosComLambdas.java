package Modulo20.Anonimas;

public class MetodosComLambdas {
    public static void main(String[] args) {
        MyEventConsumer myEvent1 = s -> imprimir(s);
        myEvent1.consumer("Ola1");
    }

    private static void imprimir(Object o) {
        System.out.println(o);
    }

}

