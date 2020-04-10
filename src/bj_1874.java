import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N];
        int top = 0;
        int num = 0;

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i++ < N) {
            int input = Integer.parseInt(br.readLine());
            // 숫자가 크다면 입력 숫자까지 push
            if (input > num) {
                for (int j = num; j < input; j++) {
                    stack[top++] = ++num;
                    sb.append("+\n");
                }
             //
            } else if (stack[top - 1] != input) {
                bw.write("NO");
                bw.close();
                System.exit(0);
            }
            top--;// 조건 통과시 입력는 숫자 무조건 pop
            sb.append("-\n");
        }
        bw.write(String.valueOf(sb));

        br.close();
        bw.close();
    }
}