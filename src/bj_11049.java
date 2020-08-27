import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_11049 {
    static int[][] matrix;
    static int[][] dp;

    private static int matrixChain(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                dp[j][j + i] = Integer.MAX_VALUE;
                for (int k = 0; k < i; k++) {
                    int cost = dp[j][j + k] + dp[j + k + 1][j + i] + matrix[j][0] * matrix[j + k][1] * matrix[j + i][1];
                    dp[j][j + i] = Math.min(dp[j][j + i], cost);
                }
            }
        }
        return dp[0][n - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        matrix = new int[N][2];
        dp = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            matrix[i][0] = Integer.parseInt(st.nextToken());
            matrix[i][1] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(matrixChain(N)));

        br.close();
        bw.close();
    }
}

