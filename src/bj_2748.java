import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_2748 {

    static long[] fib = new long[91];

    static long fibonacci(int n) {
        if (n == 0)
            return fib[0];
        else if (n == 1)
            return fib[1];
        else {
            for (int i = 2; i <= n; i++)
                fib[i] = fib[i - 1] + fib[i - 2];
            return fib[n];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        fib[0] = 0;
        fib[1] = 1;
        bw.write(String.valueOf(fibonacci(N)));

        br.close();
        bw.close();
    }
}
