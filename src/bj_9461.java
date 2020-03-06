import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_9461 {
    static long[] sequence = new long[100];

    static long Padovan(int n) {
        if (n < 3)
            return sequence[n - 1];
        else {
            for (int i = 3; i < n; i++)
                sequence[i] = sequence[i - 2] + sequence[i - 3];
            return sequence[n - 1];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());
        sequence[0] = 1;
        sequence[1] = 1;
        sequence[2] = 1;

        for (int i = 0; i < testcase; i++) {
            long result = Padovan(Integer.parseInt(br.readLine()));
            bw.write(String.valueOf(result));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
