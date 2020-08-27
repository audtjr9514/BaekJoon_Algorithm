/*
https://wellohorld.tistory.com/43
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_7579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 현재 활성화된 앱의 갯수
        int M = Integer.parseInt(st.nextToken()); // 확보해야하는 메모리

        // 0행 : 사용중인 메모리수
        // 1행 : 앱을 비활성 했을 시 드는 비용
        int[][] arr = new int[2][N];
        int allCost = 0;

        // 각 앱이 사용하는 메모리 수
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[0][i] = Integer.parseInt(st.nextToken());

        // 각 앱을 비활성화 횄을 경우의 비용
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[1][i] = Integer.parseInt(st.nextToken());
            allCost += arr[1][i];
        }
        long[] dp = new long[allCost + 1];

        // 전체적으로 훑어줌
        for (int i = 0; i < N; i++) {
            for (int j = allCost; j >= arr[1][i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - arr[1][i]] + arr[0][i]);
            }
        }
        // 0부터 전체비용까지 루프를 돌림.
        // dp[i]값이 M이 넘을 때의 비용이 최소비용이므로, 루프를 멈춰줌.
        for (int i = 0; i <= allCost; i++) {
            if (dp[i] >= M) {
                bw.write(i + "\n");
                break;
            }
        }
        br.close();
        bw.close();
    }
}
