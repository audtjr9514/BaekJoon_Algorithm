import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            if (num1 == 0 && num2 == 0) break;
            if (num1 < num2)
                if (num2 % num1 == 0)
                    bw.write("factor\n");
                else
                    bw.write("neither\n");
            else {
                if (num1 % num2 == 0)
                    bw.write("multiple\n");
                else
                    bw.write("neither\n");
            }
            st = new StringTokenizer(br.readLine());
        }


        br.close();
        bw.close();
    }
}