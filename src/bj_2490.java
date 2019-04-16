import java.util.Scanner;

public class bj_2490 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[4];
        int[] sum = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = scan.nextInt();
                sum[i] += arr[j];
            }
        }
        for (int s : sum) {
            if (s == 0)
                System.out.println("D");
            else if (s == 1)
                System.out.println("C");
            else if (s == 2)
                System.out.println("B");
            else if (s == 3)
                System.out.println("A");
            else if (s == 4)
                System.out.println("E");
        }

    }
}
