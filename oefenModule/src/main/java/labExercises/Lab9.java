package labExercises;

import extraClasses.Bank;
import extraClasses.Gender;
import extraClasses.Person;

public class Lab9 {

    public void runInMain() {
        Bank ing = new Bank();
        ing.addAccount("123456789", 0.0f);
        Person p = new Person("Joppie", 43, Gender.MALE);
        ing.getBankAccount("123456789").setOwner(p);
        System.out.println(ing.getBankAccount("123456789").toString());
    }
}
