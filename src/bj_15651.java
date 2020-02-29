import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_15651 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] arr = {1, 2, 3, 4, 5, 6, 7};
    static int[] output = new int[7];
    static boolean[] visited = new boolean[7];
    static int standard;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        standard = M;

        square_permutation(0, N, M);

        br.close();
        bw.close();
    }

    static void square_permutation(int depth, int n, int r) throws IOException {
        if (depth == r) {
            for (int i = 0; i < standard; i++)
                bw.write(output[i] + " ");
            bw.newLine();
            return;
        }

        for (int i = 0; i < n; i++) {
            output[depth] = arr[i];
            square_permutation(depth + 1, n, r);
        }
    }
}