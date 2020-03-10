import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] chk = new int[9];
        int[] result = new int[9];
        int sum = 0;
        int temp = 1;
        for (int i = 0; i < 9; i++) {
            chk[i] = 1;
            result[i] = 1;
        }

        if (N > 1) {
            for (int i = 1; i < N; i++) {
                for (int j = 1; j < 10; j++) {
                    if (j == 1) {
                        result[j - 1] = chk[j - 1] + temp;
                    } else if (j == 9) {
                        result[j - 1] = chk[j - 2];
                    } else {
                        result[j - 1] = chk[j - 2] + chk[j];
                    }
                }
                temp = chk[0];

                for (int j = 0; j < 9; j++)
                    chk[j] = result[j];
            }

            for (int i = 0; i < 9; i++)
                sum += result[i];
            for (int re : result)
                bw.write(String.valueOf(re) + " ");
//            bw.newLine();
        } else
            for (int i = 0; i < 9; i++)
                sum += result[i];
        bw.write(String.valueOf(sum));
        br.close();
        bw.close();

    }
}
