package extraClasses.Microcard;

public class GoldCard extends CustomerCard {
    public float discount;

    GoldCard(String name, String adres, String city, String customerId, float credit) {
        super.setName(name);
        super.setAdres(adres);
        super.setCity(city);
        super.setCustomerId(customerId);
        super.setCredit(credit);
    }


    @Override
    public void Pay(float amount) {
        setCredit(getCredit() - (amount - 10));
    }
}
