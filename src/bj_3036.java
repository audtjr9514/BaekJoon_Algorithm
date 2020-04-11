import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_3036 {
    public static int GCD(int N1, int N2) {
        int GCD;
        if (N1 < N2) {
            while (N2 > 0) {
                int temp = N1;
                N1 = N2;
                N2 = temp % N1;
            }
            GCD = N1;
        } else {
            while (N1 > 0) {
                int temp = N2;
                N2 = N1;
                N1 = temp % N2;
            }
            GCD = N2;
        }
        return GCD;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            nums[i] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            int GCD = GCD(nums[0], nums[i]);
            bw.write(nums[0] / GCD + "/" + nums[i] / GCD);

            bw.newLine();
        }
        br.close();
        bw.close();
    }
}