import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int[] alpha = new int[26];
        for (int i = 0; i < str.length(); i++) {
            alpha[str.charAt(i) - 'a']++;
        }
        for (int a : alpha)
            bw.write(a + " ");
        br.close();
        bw.close();

    }
}