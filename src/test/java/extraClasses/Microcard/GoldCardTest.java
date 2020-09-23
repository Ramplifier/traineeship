package extraClasses.Microcard;

import exceptions.ArgumentOutOfRange;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GoldCardTest {
    @Test
    void payTest() throws ArgumentOutOfRange {
        GoldCard gc = GoldCard.builder().name("Hello").adres("Bakkerweg 5").city("Roundabout").customerId("123456").credit(810.0f).build();
        gc.setDiscount(5.0f);
        gc.pay(40.0f);
        assertEquals(775.0f, gc.getCredit());
    }

    @Test
    void setDiscountTest() throws ArgumentOutOfRange {
        GoldCard gc = GoldCard.builder().name("Hello").adres("Bakkerweg 5").city("Roundabout").customerId("123456").credit(810.0f).build();
        gc.setDiscount(5.0f);
        assertEquals(5.0f, gc.getDiscount());
    }

    @Test
    void setDiscountOutOfRangePositiveTest() throws ArgumentOutOfRange {
        GoldCard gc = GoldCard.builder().name("Hello").adres("Bakkerweg 5").city("Roundabout").customerId("123456").credit(810.0f).build();
        assertThrows(ArgumentOutOfRange.class, () -> gc.setDiscount(-50.0f));
    }

    @Test
    void setDiscountOutOfRangeNegativeTest() throws ArgumentOutOfRange {
        GoldCard gc = GoldCard.builder().name("Hello").adres("Bakkerweg 5").city("Roundabout").customerId("123456").credit(810.0f).build();
        assertThrows(ArgumentOutOfRange.class, () -> gc.setDiscount(50.0f));
    }


}