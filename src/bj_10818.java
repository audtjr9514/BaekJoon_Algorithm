import java.util.Scanner;
import java.util.Arrays;

public class bj_10818 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];

        for (int i = 0; i < arr.length; i++)
            arr[i] = scan.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[arr.length - 1]);
    }
}
