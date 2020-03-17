import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_10996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N*2; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < N; j++)
                    if (j % 2 == 0)
                        bw.write('*');
                    else
                        bw.write(' ');
            } else
                for (int j = 0; j < N; j++)
                    if (j % 2 == 0)
                        bw.write(' ');
                    else
                        bw.write('*');

            bw.newLine();

        }
        br.close();
        bw.close();
    }

}
