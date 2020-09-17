package homeworkExercises;

public class Hw6 {
    public void arrrayCheck() {
        long[] row = new long[4];
        row[2] = 3;
        long[] copy = row;
        System.out.println(copy[2]);
        /*
            1. value of copy[2] = 3;
            2. value of row[4] = ArrayIndexOutOfBoundsException
         */
    }

    public long[] doubleArrayLength(long[] arr) {
        long[] longerArr = new long[arr.length * 2];
        for (int index = 0; index < arr.length; index++) {
            longerArr[index] = arr[index];
        }
        printLongArray(longerArr);
        return longerArr;
    }

    public void printLongArray(long[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index] + "");
        }
    }

    public void multiply(long[] input, int multiplier) {
        long[] tArr = new long[input.length];
        for (int i = 0; i < tArr.length; i++) {
            tArr[i] = input[i] * multiplier;
        }
        printLongArray(tArr);

    }


}
