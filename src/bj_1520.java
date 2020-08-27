/*
DFS를 이용한 동적계획법
https://wootool.tistory.com/83 참고
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_1520 {
    static int M;
    static int N;
    static int[][] arr;
    static int[][] dp;

    static int DFS(int x, int y) {
        if (x == (M - 1) && y == (N - 1))
            return 1;
        if (dp[x][y] == -1) {
            dp[x][y] = 0;

            // 위로 이동
            if (x > 0 && arr[x][y] > arr[x - 1][y])
                dp[x][y] += DFS(x - 1, y);
            // 아래로 이동
            if (x < M - 1 && arr[x][y] > arr[x + 1][y])
                dp[x][y] += DFS(x + 1, y);
            // 왼쪽으로 이동
            if (y > 0 && arr[x][y] > arr[x][y - 1])
                dp[x][y] += DFS(x, y - 1);
            // 오른쪽으로 이동
            if (y < N - 1 && arr[x][y] > arr[x][y + 1])
                dp[x][y] += DFS(x, y + 1);
        }

        return dp[x][y];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[M][N];
        dp = new int[M][N];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
        DFS(0, 0);
        bw.write(String.valueOf(dp[0][0]));

        br.close();
        bw.close();
    }
}
