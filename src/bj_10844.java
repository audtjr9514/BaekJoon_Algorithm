import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long[] chk = new long[9];
        long[] result = new long[9];
        long sum = 0;
        for (int i = 0; i < 9; i++) {
            chk[i] = 1;
            if (i == 8)
                result[i] = 1;
            else
                result[i] = 2;
        }

        if (N > 2) {
            for (int i = 2; i <= N; i++) {
                for (int j = 0; j < 9; j++) {
                    if (j == 0) {
                        result[j] = (chk[j] + chk[j + 1]) % 1000000000; // 앞자리 1의 경우, 2번째 전의 행 앞자리 1값 + 1개 행 전의 앞자리 2의 값
                    } else if (j == 8) {
                        result[j] = (chk[j - 1]) % 1000000000; // 앞자리가 9의 경우, 1행 전의 앞자리가 8인 계단수들이다
                    } else {
                        result[j] = (chk[j - 1] + chk[j + 1]) % 1000000000;
                    }
                }
            }
            for (int i = 0; i < 9; i++)
                sum += result[i];
//            for (int re : result)
//                bw.write(String.valueOf(re) + " ");
//            bw.newLine();
        } else
            for (int i = 0; i < 9; i++)
                sum += result[i];
        bw.write(String.valueOf(sum % 1000000000));
        br.close();
        bw.close();
    }
}
