/*
유클리드 호제법을 이용하여 최소공배수 구하기
최소공배수 = A * B / 최대공약수

먼저 최대 공약수를 유클리드 호제법으로 구한다.
유클리드 호제법 :
GCD(A, B) = GCD(B, A % B)
    if A % B = 0 => GCD = B
    else GCD(B, A % B)
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int LCM = a * b;
            int GCD = uclid(a, b);
            LCM /= GCD;

            bw.write(String.valueOf(LCM));
            bw.newLine();
        }

        br.close();
        bw.close();
    }

    static int uclid(int a, int b) {
        if (b == 0)
            return a;
        else
            return uclid(b, a % b);

    }
}
