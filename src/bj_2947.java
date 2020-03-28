import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_2947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nums[] = new int[5];
        for (int i = 0; i < 5; i++)
            nums[i] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    for (int p : nums)
                        bw.write(String.valueOf(p) + " ");
                    bw.newLine();
                }
            }
        }
        br.close();
        bw.close();
    }
}
