import java.util.Scanner;
import java.util.Arrays;

public class bj_4153 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            if (x == 0 && y == 0 && z == 0)
                break;
            int[] arr = {x, y, z};
            Arrays.sort(arr);
            if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2])
                System.out.println("right");
            else
                System.out.println("wrong");
        }
        scan.close();
    }

}
