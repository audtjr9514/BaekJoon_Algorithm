import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = "aaaaabbbbb";
        String t = "ab";
        bw.write(String.valueOf(solution(s, t)));
        br.close();
        bw.close();
    }

    public static int solution(String s, String t) {
        int result = 0;
        while (s.contains(t)) {
            s = s.replaceFirst(t, "");
            result++;
        }

        return result;
    }
}
