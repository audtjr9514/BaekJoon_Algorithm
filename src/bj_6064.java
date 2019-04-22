import java.util.Scanner;

public class bj_6064 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] test = new int[scan.nextInt()];
        for (int i = 0; i < test.length; i++) {
            int m = scan.nextInt();
            int n = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int x_c = 1, y_c = 1, check = 1;
            test[i] = 1;
            while (true) {
                if (x == x_c) check = m;
                else if (y == y_c) check = n;

                if ((x_c + check) % m == 0) x_c = m;
                else x_c = (x_c + check) % m;
                if ((y_c + check) % n == 0) y_c = n;
                else y_c = (y_c + check) % n;
                test[i] += check;

                if (x == x_c && y == y_c) break;
                if (test[i] > m * n) {
                    test[i] = -1;
                    break;
                }
            }
        }
        for (int n : test)
            System.out.println(n);
        scan.close();
    }
}
