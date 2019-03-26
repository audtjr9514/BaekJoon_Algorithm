import java.util.Scanner;

public class bj_10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] alpha = new int[26];
        for (int i = 0; i < alpha.length; i++)
            alpha[i] = -1;
        char[] str = scan.next().toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (alpha[str[i] - 97] == -1)
                alpha[str[i] - 97] = i;
        }
        for (int i = 0; i < alpha.length; i++)
            System.out.print(alpha[i] + " ");
    }
}
