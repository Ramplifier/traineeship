package extraClasses.Microcard;


import exceptions.ArgumentOutOfRange;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class CustomerCard {
    private String name;
    private String adres;
    private String city;
    private String customerId;
    private float credit;

    public void Deposit(float amount) {
        credit += amount;
    }

    public abstract void pay(float amount) throws ArgumentOutOfRange;
}


