/*
2. visitied 배열을 이용한 순열
- 사전식으로 구현 가능
  arr = r 개를 뽑기 위한 n 개의 값
  output = 뽑힌 r 개의 값
  visited = 중복해서 뽑지 않기 위해 체크하는 값
- DFS를 돌면서 모든 인덱스를 방문하여 output에 값을 넣는다.
- 이미 들어간 값은 visited 값을 true 로 바꾸어 중복하여 넣지 않는다.
- depth 값은 output에 들어간 숫자의 길이라고 생각한다.
- dapth의 값이 r에 도달하면 output에 들어있는 값을 출력한다.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_15649_2 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    static int[] output = new int[8];
    static boolean[] visited = new boolean[8];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        permutation_2(0, N, M);

        br.close();
        bw.close();
    }

    static void permutation_2(int depth, int n, int r) throws IOException {
        if (depth == r) {
            for (int i = 0; i < r; i++)
                bw.write(output[i] + " ");
            bw.newLine();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation_2(depth + 1, n, r);
                output[depth] = 0; // 이 줄은 없어도 됨
                visited[i] = false;

            }
        }
    }
}
