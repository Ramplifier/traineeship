package extraClasses.Microcard;

import exceptions.ArgumentOutOfRange;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
public class RegularCard extends CustomerCard {

    @Override
    public void pay(float amount) throws ArgumentOutOfRange {
        if (amount > getCredit()) {
            throw new ArgumentOutOfRange("not enough credit. The payment has been canceled");
        } else {
            setCredit(getCredit() - amount);
        }
    }
}
