package labExercises;

public class Lab5 {
    public static int greatest(int n1, int n2){
        if(n1 == n2){
            return -1;
        } else if (n1 > n2){
            return n1;
        } else{
            return n2;
        }
    }

    public static String greatest(String str1, String str2){
        if(str1.length() == str2.length()){
            return "The strings are even in length";
        } else if(str1.length() > str2.length()){
            return str1;
        } else {
            return str2;
        }
    }

    public static int greatest(int[] intlist){
        int biggest = intlist[0];
        for(int number : intlist){
            if(biggest < number){
                biggest = number;
            }
        }
        return biggest;
    }

    public static int factorial(int nr) {
        //int total = nr;
        //for(int index = nr -1; index > 0; index--){
        //    total = total * index;
        //}
        //return total;
        if(nr == 0){
            return 1;
        } else {
            return nr * factorial(nr-1);
        }
    }

}
