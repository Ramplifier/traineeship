package homeworkExercises;

import java.util.Scanner;
import static java.lang.Math.abs;

public class Hw2 {
    static public void printUsername(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Username");
        String username = in.nextLine();
        System.out.println("Username is:" + username);
    }

    static public void plusTwoMethod()
    {
        int plusTwo = abs(-2);
        System.out.println(plusTwo);

    }
}
