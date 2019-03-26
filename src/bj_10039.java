import java.util.Scanner;

public class bj_10039 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] < 40)
                arr[i] = 40;
            sum += arr[i];
        }
        System.out.println(sum / 5);
    }
}
