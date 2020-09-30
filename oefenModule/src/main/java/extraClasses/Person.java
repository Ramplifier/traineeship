package extraClasses;

import exceptions.PersonDiedException;
import extraClasses.annotations.MyAnnotation;
import extraClasses.annotations.MyAnnotation2;
import extraClasses.personTypes.Human;
import lombok.Data;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@MyAnnotation
@Data
public class Person extends Human {

    public static int numberOfPossibleGenders = 3;
    static final int age_max = 130;

    private String name;
    private int age;
    private Gender gender;
    private List<HistoryRecord> historyRecords = new ArrayList<>();

    public Person() {
        this("nobody");
    }

    public Person(String _name) {
        this(_name, 0);
    }

    public Person(String _name, int _age) {
        this(_name, _age, Gender.UNKNOWN);
    }

    public Person(String _name, int _age, Gender _gender) {
        setName(_name);
        setAge(_age);
        setGender(_gender);
    }

    @MyAnnotation2
    public void haveBirthday() throws PersonDiedException {
        setAge(getAge() + 1);
        if (getAge() >= 130) {
            throw new PersonDiedException("Error: This person died.");
        }
    }

    @MyAnnotation2
    public String toString() {
        return String.format("%s (%d) is %s", getName(), getAge(), getGender());
    }

    @MyAnnotation2
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

    @MyAnnotation2
    public int hashCode() {
        return getAge() * getName().hashCode() * getGender().hashCode();

    }

    @MyAnnotation2
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

    public void addHistory(String descr) {
        historyRecords.add(new HistoryRecord(descr));
    }

    public void printHistory() {
        for (HistoryRecord hisrec : historyRecords) {
            System.out.println(hisrec.toString());
        }
    }

    public Human createSubHuman() {
        return new Human() {
            @Override
            public String greet() {
                return "Sub is the best";
            }
        };
    }


    class HistoryRecord {
        String description;

        public HistoryRecord(String descr) {
            this.description = descr;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    @Override
    public String greet() {
        return String.format("Hello, my name is %s. Nice to meet you", getName());
    }
}


