package extraClasses.Microcard;

public class RegularCard extends CustomerCard {

    RegularCard(String name, String adres, String city, String customerId, float credit) {
        super.setName(name);
        super.setAdres(adres);
        super.setCity(city);
        super.setCustomerId(customerId);
        super.setCredit(credit);
    }


    @Override
    public void Pay(float amount) {
        if (amount > getCredit()) {
            System.out.println("The purchase could not be made");
        } else {
            setCredit(getCredit() - amount);
        }
    }
}
