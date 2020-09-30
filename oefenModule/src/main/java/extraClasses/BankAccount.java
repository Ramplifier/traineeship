package extraClasses;

import exceptions.InsufficientSaldoException;

public class BankAccount {
    private String number;
    private float balance;
    private float interestRate;
    private Person owner;

    private BankAccount(String _number) {
        this(_number, 0.0f);
    }

    public BankAccount(String _number, float _interestRate) {
        this(_number, 0.0f, _interestRate);
    }

    public BankAccount(String _number, float _balance, float _interestRate) {

        this(_number, _balance, _interestRate, new Person("", 0, Gender.UNKNOWN));
    }

    public BankAccount(String _number, float _balance, float _interestRate, Person _owner) {
        setNumber(_number);
        setBalance(_balance);
        setInterestRate(_interestRate);
        setOwner(_owner);
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

    public String toString() {
        return String.format("The account with the number of: %s belongs to %s", getNumber(), getOwner().getName());
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

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
