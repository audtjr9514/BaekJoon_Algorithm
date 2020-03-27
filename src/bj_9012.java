import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int Testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < Testcase; i++) {
            String str = br.readLine();
            int count = 0;
            int n = 0;
            while (n <(str.length() )) {
                if (str.charAt(n) == '(')
                    count++;
                else
                    count--;
                n++;
            }
            if (count == 0) {
                bw.write("YES");
                bw.newLine();
            } else {
                bw.write("NO");
                bw.newLine();
            }
        }

        br.close();
        bw.close();
    }
}
