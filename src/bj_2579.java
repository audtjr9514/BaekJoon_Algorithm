import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long[] stairs = new long[N+1];
        long[] sum = new long[N+1];

        for (int i = 1; i <= N; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }
        sum[1] = stairs[1];
        sum[2] = stairs[1] + stairs[2];
        for (int i = 3; i <= N; i++)
            sum[i] = Math.max(sum[i - 2] + stairs[i], sum[i - 3] + stairs[i - 1] + stairs[i]);
        bw.write(String.valueOf(sum[N]));
        br.close();
        bw.close();
    }
}
