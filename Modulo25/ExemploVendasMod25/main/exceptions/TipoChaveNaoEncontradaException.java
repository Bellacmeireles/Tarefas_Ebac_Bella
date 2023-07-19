package Modulo25.ExemploVendasMod25.main.exceptions;

public class TipoChaveNaoEncontradaException extends Exception {
    
    public TipoChaveNaoEncontradaException(String msg) {
        this(msg, null);
    }

    public TipoChaveNaoEncontradaException(String msg, Throwable e) {
        super(msg, e);
    }

}
