package extraClasses;

import exceptions.InsufficientSaldoException;

public class BankAccount {
    private String number;
    private float balance;
    private float interestRate;

    private BankAccount(String _number) {
        setNumber(_number);
        setBalance(0.0f);
        setInterestRate(0.0f);
    }

    public BankAccount(String _number, float _interestRate) {
        this(_number);
        setInterestRate(_interestRate);
    }

    public void deposit(float amount) {
        setBalance(getBalance() + amount);
    }

    public void withdrawal(float amount) throws InsufficientSaldoException {
        if (getBalance() < amount) {
            throw new InsufficientSaldoException("There is not enough money on this account to withdraw the amount");
        } else {
            setBalance(getBalance() - amount);
        }
    }

    public float calculateInterest() {
        return getBalance() * getInterestRate();
    }

    public String getNumber() {
        return this.number;
    }

    private void setNumber(String nr) {
        this.number = nr;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float amount) {
        this.balance = amount;
    }

    public float getInterestRate() {
        return this.interestRate;
    }

    private void setInterestRate(float interest) {
        this.interestRate = interest;
    }

}
