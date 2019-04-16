import java.util.Scanner;

public class bj_1978 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = scan.nextInt();
        int count = 0;
        for (int i = 0; i < sum; i++) {
            int num = scan.nextInt();
            int judge = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0)
                    judge++;
            }
            if (judge == 2)
                count++;
        }
        System.out.println(count);

    }
}
