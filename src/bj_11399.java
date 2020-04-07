import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class bj_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] times = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            times[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(times);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += times[i] * (N - i);
        }
        bw.write(String.valueOf(sum));

        br.close();
        bw.close();
    }
}
