import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N+1];
        result[1] = 0;
        if (N >= 2) {
            for (int i = 2; i < N + 1; i++) {
                result[i] = result[i - 1] + 1;
                if (i % 2 == 0)
                    result[i] = result[i] <= result[i / 2] + 1 ? result[i] : result[i / 2] + 1;
                if (i % 3 == 0)
                    result[i] = result[i] <= result[i / 3] + 1 ? result[i] : result[i / 3] + 1;
            }
        }

        bw.write(String.valueOf(result[N]));
        br.close();
        bw.close();
    }
}
