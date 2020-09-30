package extraClasses;

import exceptions.InvalidLocationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class TrajectPrijsServiceTest {

    private TrajectPrijsService target;

    @BeforeEach
    void setUp() {
        target = new TrajectPrijsService();
    }


    @Test
    public void getTrajectPrijsTest() throws InvalidLocationException {

        TrajectNaarTrajectEenhedenService tnteServiceMock = mock(TrajectNaarTrajectEenhedenService.class);
        when(tnteServiceMock.getTrajectEenheden(anyString(), anyString())).thenReturn(5);

        TrajectEenhedenNaarPrijsService tenpServiceMock = mock(TrajectEenhedenNaarPrijsService.class);
        when(tenpServiceMock.getPriceTrajectEenheden(anyInt())).thenReturn(20);

        target.setTnTEenheidService(tnteServiceMock);
        target.setTENPrijsService(tenpServiceMock);

        int prijs = target.getTrajectPrijs("Amsterdam", "Utrecht");
        assertThat(prijs, is(20));

    }

    @Test
    public void getTrajectNaarEenheidTestInvalidLocations() throws InvalidLocationException {

        TrajectNaarTrajectEenhedenService tnteServiceMock = mock(TrajectNaarTrajectEenhedenService.class);
        when(tnteServiceMock.getTrajectEenheden(startsWith("H"), anyString())).thenThrow(InvalidLocationException.class);

        assertThrows(InvalidLocationException.class, () -> tnteServiceMock.getTrajectEenheden("Hello", "World"));

    }

}