import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_10797 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (str.equals(st.nextToken()))
                result++;
        }
        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}