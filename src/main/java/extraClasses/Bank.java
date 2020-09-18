package extraClasses;

import exceptions.InsufficientSaldoException;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(String _accountNumber, float _interestRate) {
        BankAccount newAccount;
        if (_interestRate != 0.0f) {
            newAccount = new BankAccount(_accountNumber, _interestRate);
        } else {
            newAccount = new BankAccount(_accountNumber, 0.0f);
        }
        accounts.add(newAccount);
    }

    public void transfer(String numSender, String numReceiver, float amount) throws InsufficientSaldoException, IllegalArgumentException {
        BankAccount sender = getBankAccount(numSender);
        BankAccount receiver = getBankAccount(numReceiver);
        if (sender == null) {
            throw new IllegalArgumentException("The bank account of the sender is invalid");
        }
        if (receiver == null) {
            throw new IllegalArgumentException("The bank account of the reciever is invalid");
        }
        if (sender.getBalance() < amount) {
            throw new InsufficientSaldoException("The sender has insufficient saldo for the transfer");
        } else {
            sender.setBalance(sender.getBalance() - amount);
            receiver.setBalance(receiver.getBalance() + amount);
        }
    }

    public void showAllAccounts() {
        for (BankAccount account : accounts) {
            System.out.println(account.getNumber() + " : " + account.getBalance());
        }
    }

    public BankAccount getBankAccount(String number) {
        BankAccount acc;
        for (BankAccount account : accounts) {
            if (number.equals(account.getNumber())) {
                acc = account;
                return acc;
            }
        }
        return null;
    }

    public float getWorthOfBank() {
        float total = 0;
        for (BankAccount account : accounts) {
            total += account.getBalance();
        }
        return total;
    }

    public void printInterestOfAllAccounts() {
        for (BankAccount acc : accounts) {
            System.out.println("Account: " + acc.getNumber() + ", interest: " + acc.calculateInterest());
        }
    }


}

