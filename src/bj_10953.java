import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int Testcase = Integer.parseInt(br.readLine());
        int[] results = new int[Testcase];
        for (int i = 0; i < Testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ",");
            results[i] = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        }
        for (int n : results) {
            bw.write(String.valueOf(n));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}