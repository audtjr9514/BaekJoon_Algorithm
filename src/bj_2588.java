import java.util.Scanner;

public class bj_2588 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int cnt1 = num1 * (num2 % 10);
        int cnt2 = num1 * ((num2 % 100) / 10);
        int cnt3 = num1 * ((num2 / 100));

        System.out.println(cnt1);
        System.out.println(cnt2);
        System.out.println(cnt3);
        System.out.println(num1 * num2);
    }
}
