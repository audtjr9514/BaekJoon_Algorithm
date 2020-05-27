/*
v[i] = m * temp[i] + r
v[i] - v[i-1] = m * ( temp[i] - temp[i-1] ) + (r-r)
N개의 숫자를 입력받고 오름차순으로 정렬
v[i] - v[i-1] 의 최대공약수를 구한 뒤
최대공약수의 약수를 오름차순으로 나열
1. 38 -34 = 4
2. 34- 6 = 28
위 둘의 최대공약수 = 4  => 4의 약수 = 2,4
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class bj_2981 {
    static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        int gcd = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            gcd = gcd(gcd, arr[i] - arr[i - 1]);
        }

        for (int i = 2; i <= gcd; i++)
            if (gcd % i == 0) bw.write(i + " ");

        br.close();
        bw.close();
    }
}