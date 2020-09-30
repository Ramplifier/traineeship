package homeworkExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Hw6Test {

    @Test
    void doubleArrayLengthTest() {
        //Hw6 testHw6 = new Hw6();
        long[] arr = {1, 2, 3, 5};
        long[] arrdouble = {1, 2, 3, 5, 0, 0, 0, 0};

        boolean same = true;
        for (int i = 0; i < arr.length; i++) {
            if (arrdouble[i] != arr[i]) {
                same = false;
            }
        }
        for (int i = arr.length; i < arrdouble.length; i++) {
            if (arrdouble[i] != 0) {
                same = false;
            }
        }
        assertEquals(true, same);
    }
}