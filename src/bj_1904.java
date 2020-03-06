import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_1904 {
    static int[] series;

    static int binary_series(int n) {
        if (n == 1)
            return series[0];
        else if (n == 2)
            return series[1];
        else {
            for (int i = 2; i < n; i++)
                series[i] = ((series[i - 1] + series[i - 2]) % 15746);
            return series[n - 1];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        series = new int[N];
        if (N == 1)
            series[0] = 1;
        else if (N >= 2) {
            series[0] = 1;
            series[1] = 2;
        }
        bw.write(String.valueOf(binary_series(N)));

        br.close();
        bw.close();

    }
}