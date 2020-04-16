import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_11050 {
    static int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return factorial(n - 1) * n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int result = factorial(N) / factorial(K) / factorial(N - K);
        bw.write(String.valueOf(result));
        br.close();
        bw.close();
    }
}
