import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_1003 {
    static int[] cnt_0;
    static int[] cnt_1;

    static void fibonacci(int n) {
        if (n >= 2) {
            for (int i = 2; i <= n; i++) {
                cnt_0[i] = cnt_0[i - 1] + cnt_0[i - 2];
                cnt_1[i] = cnt_1[i - 1] + cnt_1[i - 2];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());
        int N;
        cnt_0 = new int[40];
        cnt_0[0] = 1;
        cnt_0[1] = 0;
        cnt_1 = new int[40];
        cnt_1[0] = 0;
        cnt_1[1] = 1;
        for (int i = 0; i < testcase; i++) {
            N = Integer.parseInt(br.readLine());
            fibonacci(N);
            bw.write(String.valueOf(cnt_0[N]) + " " + cnt_1[N]);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
