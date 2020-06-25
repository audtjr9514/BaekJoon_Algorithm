import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // K개의 랜선
        int K = Integer.parseInt(st.nextToken());
        // N개의 같은 길이의 랜선
        int N = Integer.parseInt(st.nextToken());
        long[] arr = new long[K];
        long max = 0;
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max <= arr[i]) max = arr[i];
        }
        long left = 1;
        long right = max;

        while (left <= right) {
            long mid = (left + right) / 2;
            long cnt = 0;
            for (int i = 0; i < K; i++)
                cnt += arr[i] / mid;
            if (cnt < N)
                right = mid - 1;
            else
                left = mid + 1;
        }
        bw.write(String.valueOf(right));

        br.close();
        bw.close();
    }
}
