/*
팰린드롬 [palindrome] :
 앞에서 읽으나 뒤에서부터 읽으나 같은 구조(회문 구조)를 같고 있는 단어나 문장

https://brenden.tistory.com/27
1. 1자리 숫자는 무조건 팰린드롬 = True
2. 2자리 숫자는 뒷자리 숫자가 같아야 팰린드롬
3.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_10942 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 수열의 개수
        int N = Integer.parseInt(br.readLine());

        // 칠판에 적은 수 입력
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        // DP 배열 선언
        boolean[][] dp = new boolean[N + 1][N + 1];
        // 길이가 1일 때는 무조건 팰린드롬 수열
        for (int i = 1; i <= N; i++) {
            dp[i][i] = true;
        }
        // 길이가 2일 때는 해당 숫자와 두번째와 비교하요 같은 숫자라면 팰린드롬 수열
        for (int i = 1; i < N; i++) {
            if (arr[i - 1] == arr[i])
                dp[i][i + 1] = dp[i + 1][i] = true;
        }
        // 길이가 3이상일 때
        for (int i = 2; i < N; i++) {
            for (int j = 1; j <= N - i; j++) {
                if (arr[j - 1] == arr[j + i - 1] && dp[j + 1][j + i - 1]) {
                    dp[j][j + i] = dp[j + i][j] = true;
                }
            }
        }

        // 질문의 개수
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            if (dp[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())])
                bw.write(String.valueOf(1));
            else
                bw.write(String.valueOf(0));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
