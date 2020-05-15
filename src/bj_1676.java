import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int n2 = 0;
        int n5 = 0;
        for (int i = 2; i <= n; i *= 2)
            n2 += n / i;
        for (int i = 5; i <= n; i *= 5)
            n5 += n / i;
        bw.write(String.valueOf(Math.min(n2, n5)));

        br.close();
        bw.close();
    }
}
