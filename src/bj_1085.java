import java.util.Scanner;
import java.util.Arrays;

public class bj_1085 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();
        int[] arr = {x, y, w - x, h - y};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        scan.close();
    }
}
