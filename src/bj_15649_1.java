/*
1. Swap을 이용한 순열
- swap 함수를 만들어서 배열들의 값을 직접 바꾸는 방법
- 배열의 첫 값부터 순서대로 하나씩 바꾸면서 모든 값을 한번씩 swap
- depth를 기준 인덱스로 하여 depth보다 인덱스가 작은 값들은 그대로 고정하고 depth보다 인덱스가 큰 갑ㄳ들만 가지고 다시 swap

* 하지만 순서의 보장이 되지 않는다.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_15649_1 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 수의 범위
        int M = Integer.parseInt(st.nextToken()); // 골라낼 수의 개수

        permutation_1(0, N, M);

        br.close();
        bw.close();
    }
    static void permutation_1(int depth, int n, int r) throws IOException {
        if (depth == r) {
            for (int i = 0; i < r; i++)
                bw.write(arr[i] + " ");
            bw.newLine();
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(depth, i);
            permutation_1(depth + 1, n, r);
            swap(depth, i);
        }
    }

    static void swap(int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }
}