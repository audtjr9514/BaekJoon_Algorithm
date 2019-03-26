import java.util.Scanner;

public class bj_8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = 0;
            String str = scan.next();
            int j = 1;
            for (int dab = 0; dab < str.length(); dab++) {
                if (str.charAt(dab) == 'O') {
                    score[i] += j;
                    j++;
                } else {
                    j = 1;
                }
            }
        }
        for (int sc : score)
            System.out.println(sc);
    }
}