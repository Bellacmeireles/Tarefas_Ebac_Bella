package Modulo20e21.Anonimas;

@FunctionalInterface
public interface MyEventConsumerReturn<T> {
    
    public T consumer(Object value);

}
