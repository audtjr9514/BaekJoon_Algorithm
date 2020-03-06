import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class bj_1149 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int

    static long RGB(int n) throws IOException {
        int r = Integer.parseInt(br.readLine());
        int g = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());


    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(RGB(N)));

        br.close();
        bw.close();
    }
}
