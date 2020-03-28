import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] nums = new int[Integer.parseInt(br.readLine())];
        int top = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());

        }

        br.close();
        bw.close();
    }
}