import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[100000];
        int top = -1;
        int num;
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(br.readLine());
            if (num == 0) {
                top--;
            } else {
                top++;
                nums[top] = num;
            }
        }
        int sum = 0;
        for (int i = 0; i <= top; i++)
            sum += nums[i];
        bw.write(String.valueOf(sum));
        br.close();
        bw.close();
    }
}