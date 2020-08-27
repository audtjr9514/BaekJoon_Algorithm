import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_11066 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int TestCase = Integer.parseInt(br.readLine());
        int max = Integer.MAX_VALUE;

        while (TestCase-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N + 1];
            int[] sum = new int[N + 1];
            int[][] dp = new int[502][502];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum[i] = sum[i - 1] + arr[i];
            }

            for (int i = 2; i <= N; i++) {
                for (int j = i - 1; j > 0; j--) {
                    dp[j][i] = max;
                    for (int s = j; s <= i; s++) {
                        dp[j][i] = Math.min(dp[j][i], dp[j][s] + dp[s + 1][i]);
                    }
                    dp[j][i] += sum[i] - sum[j - 1];
                }
            }
            bw.write(String.valueOf(dp[1][N]));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
