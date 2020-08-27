/*
ex) N = 4 일 때, K = 4
1 2 3 4
2 4 6 8
3 6 8 12
4 8 12 16

이 경우에 i번째 행은 i의 배수임
즉, 각 행에서 x 이하의 수의 개수는 min(x/i, N)임
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_1300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int left = 1;
        int right = (int) Math.min((long) N * N, (long) 1000000000);
        int mid;
        int count;
        int result = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            count = 0;
            for (int i = 1; i <= N; i++)
                count += Math.min(mid / i, N);
            if (count >= K) {
                result = mid;
                right = mid - 1;
            } else
                left = mid + 1;
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}
