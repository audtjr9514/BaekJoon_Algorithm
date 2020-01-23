import java.util.Scanner;

public class bj_2753 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        if ((x % 4 == 0) && (x % 100 != 0 || x % 400 == 0))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
