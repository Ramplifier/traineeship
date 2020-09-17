package extraClasses;

import exceptions.PersonDiedException;

public class Person {

    public static int numberOfPossibleGenders = 3;
    static final int age_max = 130;

    private String name;
    private int age;
    private Gender gender;

    public Person() {

    }

    public Person(String _name, int _age) {
        setName(_name);
        setAge(_age);
        setGender(Gender.UNKNOWN);
    }

    public void haveBirthday() throws PersonDiedException {
        setAge(getAge() + 1);
        if (getAge() >= 130) {
            throw new PersonDiedException("Error: This person died.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}


