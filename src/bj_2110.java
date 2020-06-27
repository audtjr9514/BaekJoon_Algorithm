import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_2110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        int left = 1;
        int right = arr[N - 1] - arr[0];
        int mid = 0;
        int count = 1;
        int result = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            count = 1;
            int first = arr[0];
            for (int i = 1; i < N; i++) {
                int distance = arr[i] - first;
                if (mid <= distance) {
                    count++;
                    first = arr[i];
                }
            }
            if (C <= count) {
                result = mid;
                left = mid + 1;
            } else right = mid - 1;
        }
        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}
