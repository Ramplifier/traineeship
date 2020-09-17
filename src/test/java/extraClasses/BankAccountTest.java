package extraClasses;

import exceptions.InsufficientSaldoException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class BankAccountTest {

    @Test
    void depositTest() {
        BankAccount accTest = new BankAccount("000000000", 0.0f);
        accTest.deposit(842.09f);
        Assertions.assertEquals(842.09f, accTest.getBalance());
    }

    @Test
    void withdrawalTest() {
        BankAccount accTest = new BankAccount("000000000", 0.0f);
        accTest.deposit(842.09f);
        try {
            accTest.withdrawal(425.42f);
        } catch (InsufficientSaldoException ex) {
            ex.getMessage();
        }

        Assertions.assertEquals(416.67f, accTest.getBalance());
    }

    @Test
    void withdrawalFailTest() {
        BankAccount accTest = new BankAccount("000000000", 0.0f);
        accTest.deposit(842.09f);

        assertThrows(InsufficientSaldoException.class, () -> accTest.withdrawal(884.42f));
    }

    @Test
    void calculateInterest() {
        BankAccount accTest = new BankAccount("000000000", 0.4f);
        accTest.deposit(500.0f);
        Assertions.assertEquals(200.0f, accTest.calculateInterest());
    }
}