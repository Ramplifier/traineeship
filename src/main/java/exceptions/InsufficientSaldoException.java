package exceptions;

public class InsufficientSaldoException extends Exception {
    public InsufficientSaldoException(String errorMessage){
        super(errorMessage);
    }
}
