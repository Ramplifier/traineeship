package extraClasses;

import exceptions.InsufficientSaldoException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BankTest {

    @Test
    void addAccountTest() {
        Bank testBank = new Bank();
        testBank.addAccount("123456789", 0.0f);
        assertEquals("123456789", testBank.getBankAccount("123456789").getNumber());
    }

    @Test
    void transferTest() {
        Bank testBank = new Bank();
        testBank.addAccount("123456781", 0.0f);
        testBank.addAccount("123456789", 0.0f);
        testBank.getBankAccount("123456781").deposit(234.56f);
        try {
            testBank.transfer("123456781", "123456789", 39.43f);
        } catch (InsufficientSaldoException ex) {
            System.out.println(ex.getMessage());
        }
        assertEquals(39.43f, testBank.getBankAccount("123456789").getBalance());
    }

    @Test
    void transferFailSenderTest() {
        Bank testBank = new Bank();
        testBank.addAccount("12341", 0.0f);
        testBank.addAccount("123456789", 0.0f);
        testBank.getBankAccount("123456781").deposit(234.56f);
        assertThrows(NullPointerException.class, () -> testBank.transfer("123456781", "123456789", 39.43f));
    }

    @Test
    void transferFailReceiverTest() {
        Bank testBank = new Bank();
        testBank.addAccount("123456781", 0.0f);
        testBank.addAccount("123456789", 0.0f);
        testBank.getBankAccount("123456781").deposit(234.56f);
        assertThrows(NullPointerException.class, () -> testBank.transfer("123456781", "123456789", 39.43f));
    }

    @Test
    void transferFailAmountTest() {
        Bank testBank = new Bank();
        testBank.addAccount("123456781", 0.0f);
        testBank.addAccount("123456789", 0.0f);
        testBank.getBankAccount("123456781").deposit(234.56f);
        assertThrows(InsufficientSaldoException.class, () -> testBank.transfer("123456781", "123456789", 4000.43f));
    }

    @Test
    void getBankAccountTest() {
        Bank testBank = new Bank();
        testBank.addAccount("123456781", 0.0f);
        testBank.addAccount("123456743", 0.0f);
        testBank.addAccount("123456726", 0.0f);
        assertEquals("123456743", testBank.getBankAccount("123456743").getNumber());
    }
}