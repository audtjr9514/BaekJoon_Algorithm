import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());
        int[] coin = new int[N];
        for (int i = 0; i < N; i++)
            coin[i] = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (sum >= coin[N - i]) {
                count += sum / coin[N - i];
                sum %= coin[N - i];
            } else continue;
        }
        bw.write(String.valueOf(count));

        br.close();
        bw.close();
    }
}
