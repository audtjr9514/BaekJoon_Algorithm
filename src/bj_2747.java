import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a =0;
        int b =1;
        int c= 0;
        int N = Integer.parseInt(br.readLine());
        if (N == 1)
            bw.write("1");
        else {
            for (int i = 1; i < N; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            bw.write(String.valueOf(c));
        }

        br.close();
        bw.close();
    }
}
