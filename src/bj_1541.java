import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] strs = str.split("-");
        int temp = 0;
        int sum = 0;
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                String[] strs_plus = strs[i].split("\\+");
                for (String s : strs_plus)
                    sum += Integer.parseInt(s);
            }
            else{
                String[] strs_plus = strs[i].split("\\+");
                for (String s : strs_plus)
                    sum -= Integer.parseInt(s);
            }
        }
        bw.write(String.valueOf(sum));

        br.close();
        bw.close();
    }
}
