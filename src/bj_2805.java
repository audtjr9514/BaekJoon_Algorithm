import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);

        long left = 1;
        long right = arr[N - 1];
        long mid;
        long sum = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            sum = 0;
            for (int i = 0; i < N; i++)
                if (arr[i] - mid > 0)
                    sum += (arr[i] - mid);
            if (sum >= M)
                left = mid + 1;
            else right = mid - 1;
        }

        bw.write(String.valueOf(right));
        br.close();
        bw.close();
    }
}
