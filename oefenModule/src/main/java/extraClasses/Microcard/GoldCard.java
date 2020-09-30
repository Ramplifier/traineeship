package extraClasses.Microcard;

import exceptions.ArgumentOutOfRange;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
public class GoldCard extends CustomerCard {

    private float discount;

    @Override
    public void pay(float amount) {
        setCredit(getCredit() - (amount - discount));
    }

    public void setDiscount(float discount) throws ArgumentOutOfRange {

        if (discount < 0) {
            throw new ArgumentOutOfRange("This number is not in the range of a valid discount");
        }
        if (discount > 30) {
            throw new ArgumentOutOfRange("This number is not in the range of a valid discount");
        } else {
            this.discount = discount;
        }

    }
}
