import java.util.Scanner;

public class bj_1065 {
    public static int count = 0;

    public static void check(int n) {
        for (int i = 0; i < n; i++) {
            int c_100 = i / 100;
            int c_10 = (i % 100 )/ 10;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        check(num);
        System.out.println(count);

        scan.close();

    }
}
