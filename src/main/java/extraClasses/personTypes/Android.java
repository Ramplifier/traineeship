package extraClasses.personTypes;

import extraClasses.interfaces.Chargeable;

public class Android extends Human implements Chargeable {
    int battery;

    @Override
    public String greet() {
        return "I'm only half human, but human still...";
    }

    @Override
    public int charge(int amount) {
        if (battery + amount > 100)
            battery += amount;
        return battery;
    }
}
