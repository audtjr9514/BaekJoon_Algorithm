/*
피사노 주기 :
피보나치 수를 나눈 나머지는 항상 주기를 가진다.
여기서 피보나치 수를 나눌 수를 K라고 할 때, K = 10^n이면,
피사노 주기는 15 * 10 ^(n-1)

이 문제에서 나누는 K가 10^6이므로
피사노 주기는 15 * 10^5이다.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_2749 {
    final static int PISANO = 1500000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long N = Long.parseLong(br.readLine());
        long[] arr = new long[PISANO];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < PISANO && i <= N; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000;  // 피보나치 수를 1,000,000 으로 나눈 나머지 값을 저장
        }
        if (N >= PISANO)
            N %= PISANO;
        bw.write(String.valueOf(arr[(int) N]));

        br.close();
        bw.close();
    }
}
