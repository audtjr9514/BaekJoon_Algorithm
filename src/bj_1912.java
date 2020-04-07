import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int numbers[] = new int[N];
        int dp[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            numbers[i] = Integer.parseInt(st.nextToken());
        if (N == 1)
            dp[0] = numbers[0];
        else {
            dp[0] = numbers[0];
            for (int i = 1; i < N; i++) {
                dp[i] = Math.max(numbers[i] + dp[i - 1], numbers[i]);
            }
        }

        int max = dp[0];
        for (int i : dp) {
//            bw.write(" " + i);
            if (max < i)
                max = i;
        }
        bw.write(String.valueOf(max));


        br.close();
        bw.close();
    }
}
