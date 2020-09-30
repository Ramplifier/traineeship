package extraClasses.personTypes;

import extraClasses.interfaces.Chargeable;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
public class Android extends Human implements Chargeable {
    int battery;

    @Override
    public String greet() {
        return String.format("I'm only half human, but human still.... My battery is filled for %d", battery) + "%.";
    }


    @Override
    public int charge(int amount) {
        if (battery + amount < 100)
            battery += amount;
        return battery;
    }
}
