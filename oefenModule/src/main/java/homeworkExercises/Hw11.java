package homeworkExercises;

import extraClasses.Person;
import extraClasses.personTypes.Human;

public class Hw11 {

    public void runInMain() {
        Person p = new Person("Jan");
        p.addHistory("Ik ben geboren");
        p.addHistory("Ik ben aan het leven");
        p.addHistory("Ik ben gestorven");
        p.printHistory();
        Human hum = new Person().createSubHuman();
        System.out.println(hum.greet());


    }
}
