import java.util.Scanner;

public class bj_1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] str = scan.next().toUpperCase().toCharArray();
        int[] arr = new int[26];
        int max = 0;
        char alpha = ' ';
        for (int i = 0; i < str.length; i++) {
            arr[str[i] - 65]++;
            if (arr[str[i] - 65] > max) {
                max = arr[str[i] - 65];
                alpha = str[i];
            } else if (max == (arr[str[i] - 65]))
                alpha = '?';
        }
        System.out.println(alpha);
        scan.close();
    }
}
