package Modulo19.Reflections.refle.exception;

public class DadosInvalidosException extends Exception {
    
    public DadosInvalidosException(String msg) {
        this(msg, null);
    }

    public DadosInvalidosException(String msg, Throwable e) {
        super(msg, e);
    }

}
