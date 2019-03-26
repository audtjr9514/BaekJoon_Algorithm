import java.util.Scanner;

public class bj_2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        String str = Integer.toString(x * y * z);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
            for (int j = 0; j < str.length(); j++)
                if (i == str.charAt(j)-'0')
                    arr[i]++;
            System.out.println(arr[i]);
        }
    }
}