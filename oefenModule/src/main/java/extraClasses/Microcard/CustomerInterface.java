package extraClasses.Microcard;

import exceptions.ArgumentOutOfRange;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerInterface {

    List<CustomerCard> cards = new ArrayList<>();

    public void addRegularCard(String _name, String _adress, String _city, String _customerID, float _credit) {
        RegularCard rc = RegularCard.builder().name(_name).adres(_adress).city(_city).customerId(_customerID).credit(_credit).build();
        cards.add(rc);
    }

    public void addGoldCard(String _name, String _adress, String _city, String _customerID, float _credit, float _discount) {
        GoldCard gc = GoldCard.builder().name(_name).adres(_adress).city(_city).customerId(_customerID).credit(_credit).build();
        try {
            gc.setDiscount(-50.0f);
            System.out.println(gc.getDiscount());
        } catch (ArgumentOutOfRange ex) {
            ex.getMessage();
        }

        cards.add(gc);
    }

    public void getListOfCustomers() {
        System.out.println("CardId  Name        Credit      Discount");
        for (CustomerCard card : cards) {
            if (card.getClass() == RegularCard.class) {
                System.out.println(card.getCustomerId() + "    " + card.getName() + "      " + card.getCredit());
            } else if (card.getClass() == GoldCard.class) {
                System.out.println(card.getCustomerId() + "    " + card.getName() + "     " + card.getCredit() + "       " + ((GoldCard) card).getDiscount());

            } else {
                System.out.println("this card could not be read.");
            }
        }
    }

    public CustomerCard getCustomer(String id) {
        CustomerCard cc;
        for (CustomerCard card : cards) {
            if (id.equals(card.getCustomerId())) {
                cc = card;
                return cc;
            }
        }
        return null;
    }

    public void buy() {
        CustomerCard cc;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the customerID:");
        cc = getCustomer(input.nextLine());
        System.out.println("enter the amount to pay");
        float amount = Float.parseFloat(input.nextLine());
        try {
            cc.pay(amount);
        } catch (ArgumentOutOfRange ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("new balance is : " + cc.getCredit());


    }

}
