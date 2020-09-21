package extraClasses.personTypes;


import extraClasses.Person;

public class Employee extends Person {

    @Override
    public String greet() {
        return "I'm tired of working. This is inhuman!";
    }
}
