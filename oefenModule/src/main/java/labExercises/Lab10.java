package labExercises;

import exceptions.ArgumentOutOfRange;
import extraClasses.Microcard.CustomerInterface;

public class Lab10 {
    public void runInMain() throws ArgumentOutOfRange {
        CustomerInterface cusI = new CustomerInterface();
        cusI.addRegularCard("Piet", "Bakkerweg 23", "Boekbergen", "32342", 420.0f);
        cusI.addRegularCard("Geer", "Bakkerweg 23", "Boekbergen", "32343", 410.0f);
        cusI.addGoldCard("Rems", "Bakkerweg 23", "Boekbergen", "32318", 420.0f, 10.0f);
        cusI.addRegularCard("Kel", "Bakkerweg 23", "Boekbergen", "32344", 950.0f);
        cusI.addRegularCard("Kor", "Bakkerweg 23", "Boekbergen", "32349", 10.0f);
        cusI.addGoldCard("Vera", "Bakkerweg 23", "Boekbergen", "32342", 420.0f, 5.0f);
        cusI.addRegularCard("Nico", "Bakkerweg 23", "Boekbergen", "32346", 7560.0f);
        cusI.addRegularCard("Wim", "Bakkerweg 23", "Boekbergen", "32347", 720.0f);
        cusI.addRegularCard("Waster", "Bakkerweg 23", "Boekbergen", "32348", 670.0f);
        cusI.addRegularCard("Teo", "Bakkerweg 23", "Boekbergen", "32342", 420.0f);
        cusI.addGoldCard("Manny", "Bakkerweg 23", "Boekbergen", "32312", 420.0f, 15.0f);
        cusI.addGoldCard("Penny", "Bakkerweg 23", "Boekbergen", "32311", 420.0f, 10.0f);

        //cusI.getListOfCustomers();
        cusI.buy();
        //cusI.getListOfCustomers();


    }
}
