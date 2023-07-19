package Modulo25.ExemploVendasMod25.main.exceptions;

public class DadosInvalidosException extends Exception {
    
    public DadosInvalidosException(String msg) {
        this(msg, null);
    }

    public DadosInvalidosException(String msg, Throwable e) {
        super(msg, e);
    }

}
