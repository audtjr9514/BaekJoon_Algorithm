import java.util.Scanner;

public class bj_2581 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        int sum = 0, min = end + 1;
        for (int i = start; i <= end; i++) {
            int judge = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    judge++;
            }
            if (judge == 2) {
                sum += i;
                if (min > i)
                    min = i;
            }
        }
        if (sum != 0)
            System.out.println(sum + "\n" + min);
        else
            System.out.println(-1);

    }
}
