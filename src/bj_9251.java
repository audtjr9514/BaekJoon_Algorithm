import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_9251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int[][] dp = new int[str2.length() + 1][str1.length() + 1];

        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {
                if (str2.charAt(i-1) != str1.charAt(j-1))
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                else
                    dp[i][j] = dp[i-1][j-1]+1;
            }
        }
        bw.write(String.valueOf(dp[str1.length()][str2.length()]));

        br.close();
        bw.close();
    }
}