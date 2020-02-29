import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_15650 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    static int[] output = new int[8];
    static boolean[] visited = new boolean[8];
    static int standard;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        standard = M;

        combination(0, N, M);

        br.close();
        bw.close();
    }

    static void combination(int depth, int n, int r) throws IOException {
        if (r == 0 ) {
            for (int i = 0; i < standard; i++)
                bw.write(output[i] + " ");
            bw.newLine();
            return;
        }

        for (int i = depth; i < n; i++) {
            if (visited[i]== false) {
                visited[i] = true;
                output[standard-r] = arr[i];
                combination(i + 1, n, r-1);
                visited[i] = false;
            }
        }
    }
}