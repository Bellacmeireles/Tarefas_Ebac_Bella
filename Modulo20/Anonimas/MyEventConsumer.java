package Modulo20.Anonimas;

@FunctionalInterface
public interface MyEventConsumer {
    
    public void consumer(Object value);

    default void calcular() {

    }

}
