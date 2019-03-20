import java.util.Scanner;

public class bj_2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        if (x == 1 || x == 2 || x == 4 || x == 7) {
            System.out.print(-1);
        } else if (x % 5 == 0) {
            System.out.print((x / 5));
        } else {
            if ((x % 5) % 3 != 0) {
                System.out.print(x / 3);
            } else if ((x / 5) + ((x % 5) / 3) >= (x / 3)) {
                System.out.print(x / 3);
            } else {
                System.out.print((x / 5) + ((x % 5) / 3));
            }
        }
    }
}
