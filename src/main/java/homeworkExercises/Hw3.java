package homeworkExercises;

import extraClasses.Client;

public class Hw3 {
    public static void plussen()
    {
        int i = 5;
        System.out.println("begingetal: " + i);
        int a = i;
        System.out.println("a++= " + a++);
        int b = i;
        System.out.println("++b= " + ++b);

        int k = 3;
        int l = k < 3 ? k++ + ++k : ++k >>> 1;
        System.out.println(l);
    }

    public static void binarySum(){
        String i1 = "1010";
        String i2 = "10";

        int n1 = Integer.parseInt(i1,2);
        int n2 = Integer.parseInt(i2,2);

        int sum = n1 + n2;
        System.out.println(Integer.toBinaryString(sum));

    }

    public static void calculateTime(){
        //code here
    }

    public static void clientProblem(){
        Client client1 = new Client();
        client1.name = "Jan";
        Client client2 = new Client();
        client2.name = "Piet";
        client2 = client1;
        client2.name = "Joris";

        System.out.println(client1.name);
    }

    public static void Stringss(String s){
        s = s + "1";


    }


}
