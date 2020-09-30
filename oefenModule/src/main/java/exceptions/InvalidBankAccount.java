package exceptions;

public class InvalidBankAccount extends Exception{
    public InvalidBankAccount(String errormessage) {
        super(errormessage);
    }
}

