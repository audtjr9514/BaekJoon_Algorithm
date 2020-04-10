import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int i = 2;
        while (true) {
            if (N == 1)
                break;
            else {
                if (N % i == 0) {
                    N /= i;
                    bw.write(String.valueOf(i));
                    bw.newLine();
                    i = 2;
                } else
                    i++;

            }
        }
        br.close();
        bw.close();
    }
}