package kakao_2022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println(solution(437674, 3));
        br.close();
        bw.close();
    }

    public static int solution(int n, int k) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();
        int current = n;

        while (current > 0) {
            if (current % k < 10) {
                sb.append(current % k);
            } else {
                sb.append((char) (current % k - 10 + 'A'));
            }
            current /= k;
        }
        String[] strs = sb.reverse().toString().split("0");

        for (String str : strs) {
            if (!str.equals("")) {
                int num = Integer.parseInt(str);
                if (isPrime(num)) answer++;
            }
        }
        return answer;
    }

    static boolean isPrime(int n) {
        int i;
        if (n == 1) return false;
        for (i = 2; i < n; i++)
            if (n % i == 0) return false;
        return true;
    }
}
