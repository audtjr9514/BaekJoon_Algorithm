import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_2565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int elec[][] = new int[2][N];
        int dp[] = new int[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            elec[0][i] = Integer.parseInt(st.nextToken());
            elec[1][i] = Integer.parseInt(st.nextToken());
        }
        int temp;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (elec[0][j] > elec[0][j + 1]) {
                    temp = elec[0][j];
                    elec[0][j] = elec[0][j + 1];
                    elec[0][j + 1] = temp;
                    temp = elec[1][j];
                    elec[1][j] = elec[1][j + 1];
                    elec[1][j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (elec[1][i] > elec[1][j] && dp[i] <= dp[j])
                    dp[i] = dp[j] + 1;
                else if (elec[1][i] == elec[1][j])
                    dp[i] = dp[j];
            }
        }
//        for (int c[] : elec) {
//            for (int s : c)
//                bw.write(" " + s);
//            bw.newLine();
//        }
        int max = 0;

        for (int d : dp)
            if (max < d)
                max = d;
        bw.write(String.valueOf(N - max));
        br.close();
        bw.close();
    }
}
