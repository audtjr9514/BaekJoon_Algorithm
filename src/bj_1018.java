import java.util.Scanner;

public class bj_1018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        char[][] chess = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = scan.next();
            for (int j = 0; j < m; j++)
                chess[i][j] = str.charAt(j);
        }
        scan.close();
    }
}
