import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Practice_Code {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            int result = 0;
            String str = br.readLine();
            int score = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O')
                    score++;
                else
                    score = 0;
                result += score;
            }
            bw.write(String.valueOf(result));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
