import les3.Client;

public class Main {

    public static void main(String[] args){
        int i = 5;
        System.out.println("begingetal: " + i);
        int a = i;
        System.out.println("a++= " + a++);
        int b = i;
        System.out.println("++b= " + ++b);

        int k = 3;
        int l = k < 3 ? k++ + ++k : ++k >>> 1;
        System.out.println(l);

        System.out.println(binarySum());
        calculateTime();
        clientProblem();



    }

    public static String binarySum(){
        String i1 = "1010";
        String i2 = "10";

        int n1 = Integer.parseInt(i1,2);
        int n2 = Integer.parseInt(i2,2);

        int sum = n1 + n2;
        return Integer.toBinaryString(sum);

    }

    //
    public static void calculateTime(){
        int hours = 80;
        int restTime = hours % 24;
        int calcTime = 23;
        int days = 0;

        calcTime += hours;

        while(calcTime > 23)
        {
            calcTime-= 24;
            days++;
        }

        System.out.println(restTime +":00");
        System.out.println("days later: " + days);
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

}
