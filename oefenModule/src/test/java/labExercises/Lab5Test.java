package labExercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Lab5Test {

    @Test
    public void greatestIntTestInt1Bigger(){
        int n1 = 5, n2 = 2;
        assertEquals(n1, Lab5.greatest(n1,n2));
    }

    @Test
    public void greatestIntTestInt2Bigger(){
        int n1 = 2, n2 = 5;
        assertEquals(n2, Lab5.greatest(n1,n2));
    }

    @Test
    public void greatestIntTestEven(){
        int n1 =5, n2 = 5;

        assertEquals(-1, Lab5.greatest(n1,n2));
    }

    @Test
    public void greatestStringTestSting1Longer(){
        String str1 = "Worldo";
        String str2 = "Hello";
        assertEquals(str1, Lab5.greatest(str1,str2));
    }

    @Test
    public void greatestStringTestSting2Longer(){
        String str1 = "Hello";
        String str2 = "Worldo";
        assertEquals(str2, Lab5.greatest(str1,str2));
    }

    @Test
    public void greatestStringTestStingEven(){
        String str1 = "Hello";
        String str2 = "Hello";
        assertEquals("The strings are even in length", Lab5.greatest(str1,str2));
    }

    @Test
    public void greatestIntInListTest(){
        int[] numlist = {55,57,951,638,428,31,84};
        assertEquals(951,Lab5.greatest(numlist));
    }

    @Test
    public void factorialTest(){
        assertEquals(120,Lab5.factorial(5));
    }
}
