import java.util.Scanner;

public class bj_2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scan.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[count] <= arr[i])
                count = i;

        System.out.println(arr[count] + "\n" + (count + 1));
    }
}
