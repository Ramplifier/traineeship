package homeworkExercises;

import extraClasses.personTypes.Android;


public class Hw10 {

    public void runInMain() {
        Android andro = new Android();
        while (andro.getBattery() < 84) {
            System.out.println(andro.greet());
            andro.charge(3);

        }
    }
}
