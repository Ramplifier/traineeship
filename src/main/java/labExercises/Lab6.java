package labExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lab6 {
    public static int sum10(){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.println("number "+ i+" entered.");
            sum += Integer.parseInt(input.nextLine());

        }
        return sum;
    }

    public static void sudokuSquare(int size){

        int[][] square = new int[size][size];
        List<Integer> numList = new ArrayList<>();
        for(int nr = 1; nr <= (size*size); nr++){
            numList.add(nr);
        }
        Random rand = new Random();
        for(int x = 0; x < size; x++){
            for(int y = 0; y < size; y++){
                int r = rand.nextInt(numList.size());
                square[x][y] = numList.get(r);
                numList.remove(r);
            }
        }
        printSudokusquare(square,size);
    }

    public static void printSudokusquare(int[][] square, int size){
        for(int x = 0; x < size; x++ ){
            for(int y = 0; y < size; y++ ){
                System.out.print(square[x][y] + "   ");
            }
            System.out.println();
        }
    }

}
