package homeworkExercises;

import extraClasses.Gender;
import extraClasses.Person;

public class Hw8 {
    public void runInMain() {
        Person piet = new Person("Piet", 23, Gender.MALE);
        Person piet2 = new Person("Piet", 23, Gender.MALE);
        System.out.println(piet.equals(piet2));
        Person saar = new Person("Saar", 33, Gender.FEMALE);
        System.out.println(piet.equals(saar));
        System.out.println(piet.hashCode());
        piet.getAllMethodsOfClass();
    }


}
