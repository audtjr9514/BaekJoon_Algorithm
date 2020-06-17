import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_1629 {
    public static long multiple(long a, long b, long c) {
        if (b == 1) return a; // b = 1 일 때
        long temp = multiple(a, b / 2, c) % c;
        if (b % 2 == 0) { // b = 짝수일 때
            return (temp * temp) % c;
        } else {// b가 홀수일 때
            return (((temp * temp) % c) * a) % c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(multiple(a % c, b, c)));

        br.close();
        bw.close();
    }
}
