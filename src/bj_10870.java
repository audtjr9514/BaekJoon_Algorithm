import java.util.Scanner;

public class bj_10870 {
    public static int Fibonacci(int n) {
        if (n >= 2)
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        else if (n == 1)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Fibonacci(scan.nextInt()));
        scan.close();
    }
}
