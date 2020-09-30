package extraClasses;

import extraClasses.personTypes.Human;
import extraClasses.personTypes.Teacher;

import java.util.ArrayList;
import java.util.List;

public class House<T extends Human> {

    public List<T> residents = new ArrayList<>();

    public House(T owner) {
        addResidentToHouse(owner);
    }

    public void addResidentToHouse(T resident) {
        residents.add(resident);
    }

    @Override
    public String toString() {
        return String.format("This hous is owned by %s and the owner says %s", residents.get(0).toString(), residents.get(0).greet());
    }


    public void PrintResidents() {
        for (T resident : residents) {
            System.out.println(resident.greet());
        }
    }

    static class Main {
        public static void main(String[] args) {
            House<Human> cardboardBox = new House<>(new Person("Jan", 34));
            cardboardBox.addResidentToHouse(new Teacher());
            System.out.println(cardboardBox.toString());
            cardboardBox.PrintResidents();


        }
    }
}

