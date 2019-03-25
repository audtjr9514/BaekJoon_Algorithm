import java.util.Scanner;

public class bj_8393 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int x = scan.nextInt();
        for (int i = 1; i < x + 1; i++)
            sum += i;
        System.out.println(sum);
    }
}