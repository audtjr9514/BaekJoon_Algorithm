import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        for (int i = 0; i < N; i++)
            nums[i] = Integer.parseInt(br.readLine());
        int[] chk = new int[N];
        int i = 2;
        while (i < nums[0]) {
            for (int j = 0; j < N; j++)
                chk[j] = nums[j] % i;
            int j;
            for (j = 1; j < N; j++)
                if (chk[j - 1] != chk[j])
                    break;
            if (j == N - 1)
                bw.write(i + " ");
            i++;
        }

        br.close();
        bw.close();
    }
}