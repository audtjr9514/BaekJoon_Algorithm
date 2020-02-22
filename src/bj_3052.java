import java.util.Scanner;
import java.util.Arrays;

public class bj_3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scan.nextInt() % 42;
        Arrays.sort(arr);
        int count = 1, temp = arr[0];
        for (int n : arr)
            if (temp != n) {
                temp = n;
                count++;
            }
        System.out.println(count);
    }
}