package Modulo20e21.Anonimas;

@FunctionalInterface
public interface MyEventConsumer {
    
    public void consumer(Object value);

    default void calcular() {

    }

}
