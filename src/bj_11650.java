import java.util.Scanner;
import java.util.Arrays;

public class bj_11650 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[][] point = new int[num][2];
        for (int i = 0; i < num; i++) {
            point[i][0] = scan.nextInt();
            point[i][1] = scan.nextInt();
        }

    }
}
