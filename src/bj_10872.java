import java.util.Scanner;

public class bj_10872 {
    public static int factorial(int n) {
        if (n > 1)
            return factorial(n-1) * n;
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(factorial(scan.nextInt()));
        scan.close();
    }
}
