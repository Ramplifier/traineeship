package labExercises;

import extraClasses.ScannerWrapper;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class Lab4Test {

    Lab4 target = new Lab4();

    ScannerWrapper mock = mock(ScannerWrapper.class);

    @Test
    void executeProof() {
        Lab4 target = new Lab4();
        target.setScannerWrapper(mock);
        when(mock.read()).thenReturn("123456789");
    }
}