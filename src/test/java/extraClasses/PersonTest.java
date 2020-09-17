package extraClasses;

import exceptions.PersonDiedException;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonTest {

    @Test
    void personTest() {
        Person p = new Person("Jan", 43);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());
        try {
            p.haveBirthday();
            System.out.println(p.getAge());
        } catch (PersonDiedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Person.numberOfPossibleGenders);
    }

    @Test
    void personConstructorTest() {

        Person p = new Person("Stijn", 24);
        assertEquals("Stijn", p.getName());
        assertEquals(24, p.getAge());
    }

    @Test
    void birthdayInvalidAge() {
        Person p = new Person("Stijn", 150);
        assertThrows(PersonDiedException.class, p::haveBirthday);
    }

    @Test
    void testToString() {
        Person p = new Person("Piet", 23, Gender.MALE);
        assertEquals("Piet (23) is MALE", p.toString());
    }

    @Test
    void testEquals() {
        Person p = new Person("Piet", 23, Gender.MALE);
        Person p2 = new Person("Piet", 23, Gender.MALE);
        assertTrue(p.equals(p2));
    }

    @Test
    void testEqualsNot() {
        Person p = new Person("Piet", 23, Gender.MALE);
        Person p2 = new Person("Saar", 33, Gender.FEMALE);
        assertFalse(p.equals(p2));
    }
}