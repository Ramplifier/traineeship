package extraClasses.Microcard;


import lombok.Data;

@Data

public abstract class CustomerCard {
    private String name;
    private String adres;
    private String city;
    private String customerId;
    private float credit;

    public void Deposit(float amount) {
        credit += amount;
    }

    public abstract void Pay(float amount);

}


