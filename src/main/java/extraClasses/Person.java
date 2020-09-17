package extraClasses;

import exceptions.PersonDiedException;

import java.lang.reflect.Method;

public class Person {

    public static int numberOfPossibleGenders = 3;
    static final int age_max = 130;

    private String name;
    private int age;
    private Gender gender;

    public Person(String _name, int _age) {
        setName(_name);
        setAge(_age);
        setGender(Gender.UNKNOWN);
    }

    public Person(String _name, int _age, Gender _gender) {
        setName(_name);
        setAge(_age);
        setGender(_gender);
    }

    public void haveBirthday() throws PersonDiedException {
        setAge(getAge() + 1);
        if (getAge() >= 130) {
            throw new PersonDiedException("Error: This person died.");
        }
    }

    public String toString() {
        return String.format("%s (%d) is %s", getName(), getAge(), getGender());
    }

    public boolean equals(Person p) {
        boolean same = true;
        if (!getName().equals(p.getName())) {

            same = false;
        }
        if (getAge() != p.getAge()) {

            same = false;
        }
        if (getGender() != p.getGender()) {
            same = false;
        }
        return same;
    }

    public int hashCode() {
        return getAge() * getName().hashCode() * getGender().hashCode();

    }

    public void getAllMethodsOfClass() {
        Method[] methods = Person.class.getDeclaredMethods();
        int nMethod = 1;
        System.out.println("List of all methods of Person class");
        for (Method method : methods) {
            System.out.printf("%d. %s", nMethod++, method);
            System.out.println();
        }
        System.out.println("End - all methods of Person Class");
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


