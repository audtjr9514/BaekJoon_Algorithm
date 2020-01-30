import java.util.Scanner;

public class bj_1065 {
    public static int count = 99;

    public static void check(int n) {
        if (n < 100)
            count = n;
        else {
            for (int i = 100; i <= n; i++) {
                int first = ((i / 10) % 10) - (i / 100); // 10자릿수 - 100자릿수
                int second = (i % 10) - ((i / 10) % 10); // 1자릿수 - 10자릿수
                if (first == second)
                    count++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        check(scan.nextInt());
        System.out.println(count);

        scan.close();
    }
}
