package homeworkExercises;

public class Hw5 {

    public void run(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    public void run(int start, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }


    public int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo(n - 2) + fibo(n - 1);
    }
}
