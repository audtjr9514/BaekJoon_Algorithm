import java.util.Scanner;

public class bj_1018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // 가로
        int m = scan.nextInt(); // 세로
        int min = 63;

        String bw = "BWBWBWBW";
        String wb = "WBWBWBWB";

        char[][] chess = new char[n][m];

        for (int i = 0; i < n; i++) {
            String str = scan.next();
            for (int j = 0; j < m; j++)
                chess[i][j] = str.charAt(j);
        } // 입력

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int bw_temp = 0;
                int wb_temp = 0;

                for (int x = i; x < i + 8; x++) {
                    int count1 = 0;
                    int count2 = 0;
                    for (int y = j; y < j + 8; y++) {
                        if (x % 2 == 1) {
                            if (chess[x][y] != bw.charAt(count1++))
                                bw_temp++;
                            if (chess[x][y] != wb.charAt(count2++))
                                wb_temp++;
                        } else {
                            if (chess[x][y] != wb.charAt(count1++))
                                bw_temp++;
                            if (chess[x][y] != bw.charAt(count2++))
                                wb_temp++;
                        }
                    }
                }
                if (bw_temp <= wb_temp) {
                    if (bw_temp <= min)
                        min = bw_temp;
                } else {
                    if (wb_temp <= min)
                        min = wb_temp;
                }

            }
        }
        System.out.println(min);


        scan.close();
    }
}
