import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_2630 {
    static int white = 0;
    static int blue = 0;

    static void color(int x, int y, int length, int arr[][]) {
        int chk;
        boolean all_chk = true;
        if (arr[x][y] == 0) chk = 0;
        else chk = 1;
        loop:
        for (int i = x; i < x + length; i++) {
            for (int j = y; j < y + length; j++) {
                if (arr[i][j] != chk) {
                    all_chk = false;
                    break loop;
                }
            }
        }
        if (all_chk == false) {
            color(x, y, length / 2, arr); // 상좌
            color(x + length / 2, y, length / 2, arr); // 상좌
            color(x, y + length / 2, length / 2, arr); // 하좌
            color(x + length / 2, y + length / 2, length / 2, arr); // 하우
        } else {
            if (chk == 0)
                white++;
            else
                blue++;
            return;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }
        color(0, 0, n, arr);
        bw.write(white + " \n" + blue);

        br.close();
        bw.close();
    }
}
