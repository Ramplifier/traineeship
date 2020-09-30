package labExercises;

import exceptions.InsufficientSaldoException;
import extraClasses.Bank;


public class Lab7 {

    public void bankFlow() {
        Bank raboBank = new Bank();
        for (int index = 0; index <= 9; index++) {
            raboBank.addAccount("12345678" + index, 0.4f);
            raboBank.getBankAccount("12345678" + index).deposit(50.0f);
        }

        raboBank.getBankAccount("123456781").deposit(500.0f);
        //raboBank.showAllAccounts();
        try {
            raboBank.transfer("123456781", "123456787", 342.23f);
        } catch (InsufficientSaldoException ex) {
            System.out.println(ex.getMessage());
        }
        //raboBank.showAllAccounts();
        System.out.println(raboBank.getWorthOfBank());
        raboBank.getBankAccount("123456787").deposit(500.0f);
        System.out.println(raboBank.getBankAccount("123456787").calculateInterest());
        raboBank.printInterestOfAllAccounts();


    }
}
