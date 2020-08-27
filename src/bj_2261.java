import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_2261 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int N = Integer.parseInt(st.nextToken());
            if (N == 0)
                break;
            long[] arr = new long[N];
            for (int i = 0; i < N; i++)
                arr[i] = Long.parseLong(st.nextToken());
        }

        br.close();
        bw.close();
    }
}
