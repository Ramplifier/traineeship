package exceptions;

public class InvalidLocationException extends Exception {
    public InvalidLocationException(String errormessage) {
        super(errormessage);
    }
}
