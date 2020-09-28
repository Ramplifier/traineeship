package extraClasses;

import exceptions.InvalidLocationException;

public class TrajectNaarTrajectEenhedenService {

    public int getTrajectEenheden(String from, String to) throws InvalidLocationException {

        if (from == "Hello") {
            throw new InvalidLocationException("This place does not exist");
        }
        return 0;
    }
}
