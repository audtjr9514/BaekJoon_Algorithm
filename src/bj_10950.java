import java.util.Scanner;

public class bj_10950 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Test = scan.nextInt();
        int[] result = new int[Test];
        for (int i = 0; i < Test; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            result[i] = x + y;
        }
        for(int z =0; z<result.length; z++)
            System.out.println(result[z]);
    }
}
