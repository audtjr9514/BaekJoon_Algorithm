import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_1992 {
    static void quad(int x, int y, int length, int[][] arr, StringBuilder sb) {
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
            sb.append("(");
            quad(x, y, length / 2, arr, sb); // 상좌
            quad(x, y + length / 2, length / 2, arr, sb); // 상우
            quad(x + length / 2, y, length / 2, arr, sb); // 하좌
            quad(x + length / 2, y + length / 2, length / 2, arr, sb); // 하우
            sb.append(")");
        } else {
            if (chk == 1)
                sb.append(1);
            else
                sb.append(0);
            return;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        String str;
        for (int i = 0; i < n; i++) {
            str = br.readLine();
            for (int j = 0; j < n; j++)
                arr[i][j] = Integer.parseInt(str.split("")[j]);
        }
        StringBuilder sb = new StringBuilder();
        quad(0, 0, n, arr, sb);
        bw.write(String.valueOf(sb));

        br.close();
        bw.close();
    }
}
