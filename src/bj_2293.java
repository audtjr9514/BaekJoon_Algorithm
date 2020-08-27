import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_2293 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        for (int i = 1; i < N + 1; i++)
            arr[i] = Integer.parseInt(br.readLine());

        int[] dp = new int[K + 1];
        dp[0] = 1;
        for (int i = 1; i < N + 1; i++) {
            for (int j = arr[i]; j <= K; j++) {
                dp[j] += dp[j - arr[i]];
            }
        }
        bw.write(String.valueOf(dp[K]));

        br.close();
        bw.close();
    }
}
