import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_11051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] Triangle = new int[n + 1][n + 1];

        for (int i = 0; i < Triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0)
                    Triangle[i][j] = 1;
                else
                    Triangle[i][j] = (Triangle[i - 1][j - 1] + Triangle[i - 1][j]) % 10007;
            }
        }
        bw.write(String.valueOf(Triangle[n][k]));

        br.close();
        bw.close();
    }
}
