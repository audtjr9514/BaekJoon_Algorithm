import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_9251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] str1 = br.readLine().toCharArray();
        char[] str2 = br.readLine().toCharArray();
        int[][] dp = new int[str1.length+1][str2.length+1];

        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str1[i] != str2[j])
                    dp[j + 1][i + 1] = Math.max(dp[j + 1][i], dp[j][i + 1]);
                else
                    dp[j + 1][i + 1] = dp[j][i] + 1;
           }
        }
        bw.write(String.valueOf(dp[str1.length][str2.length]));

        br.close();
        bw.close();
    }
}
