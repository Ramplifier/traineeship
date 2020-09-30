package homeworkExercises;

public class Hw5 {

    public long run(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo(i) + " ");
        }
        return fibo(n);
    }

    public long[] runArr(int n) {
        long[] fibovalues = new long[n];
        for (int i = 1; i < n; i++) {
            fibovalues[i] = fibo(i);
        }
        return fibovalues;
    }


    public long fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo(n - 2) + fibo(n - 1);
    }
}
