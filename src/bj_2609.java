import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());
        int LCM = N1 * N2;
        int GCD;
        if (N1 < N2) {
            while (N2 > 0) {
                int temp = N1;
                N1 = N2;
                N2 = temp % N1;
            }
            GCD = N1;
        } else {
            while (N1 > 0) {
                int temp = N2;
                N2 = N1;
                N1 = temp % N2;
            }
            GCD = N2;
        }
        LCM /= GCD;
        bw.write(String.valueOf(GCD));
        bw.newLine();
        bw.write(String.valueOf(LCM));

        br.close();
        bw.close();
    }
}