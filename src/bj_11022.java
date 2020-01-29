import java.util.Scanner;

public class bj_11022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testcase = scan.nextInt();
        for (int i = 0; i < testcase; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x > 0 && y < 10)
                System.out.println("Case #" + (i + 1) + ": " + x + " + " + y + " = " + (x + y));
        }
    }
}
