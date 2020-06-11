import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_1780 {
    static int minusOne = 0;
    static int Zero = 0;
    static int One = 0;

    static void paper(int x, int y, int length, int arr[][]) {
        int chk;
        boolean all_chk = true;
        if (arr[x][y] == -1) chk = -1;
        else if (arr[x][y] == 0) chk = 0;
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
            paper(x, y, length / 3, arr);
            paper(x, y + length / 3, length / 3, arr);
            paper(x, y + 2 * (length / 3), length / 3, arr);
            paper(x + length / 3, y, length / 3, arr);
            paper(x + length / 3, y + length / 3, length / 3, arr);
            paper(x + length / 3, y + 2 * (length / 3), length / 3, arr);
            paper(x + 2 * (length / 3), y, length / 3, arr);
            paper(x + 2 * (length / 3), y + length / 3, length / 3, arr);
            paper(x + 2 * (length / 3), y + 2 * (length / 3), length / 3, arr);
        } else {
            if (chk == -1)
                minusOne++;
            else if (chk == 0)
                Zero++;
            else
                One++;
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
        paper(0, 0, n, arr);
        bw.write(minusOne + "\n" + Zero + "\n" + One);


        br.close();
        bw.close();
    }
}
