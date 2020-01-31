import java.util.Scanner;

public class bj_2447 {
    public static void star(int n) {

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                star(n);
        scan.close();

    }
}

