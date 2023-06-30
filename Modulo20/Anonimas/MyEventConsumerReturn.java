package Modulo20.Anonimas;

@FunctionalInterface
public interface MyEventConsumerReturn<T> {
    
    public T consumer(Object value);

}
