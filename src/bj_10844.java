import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_10844 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        long[][] stairs = new long[N][9];
        long sum = 0;
        // 초기 설정
        for (int i = 0; i < 9; i++) {
            stairs[0][i] = 1;
            if (i == 8)
                stairs[1][i] = 1;
            else
                stairs[1][i] = 2;
        }

        if (N > 2) {
            for (int i = 2; i < N; i++) {
                for (int j = 0; j < 9; j++) {
                    if (j == 0) {
                        stairs[i][j] = (stairs[i - 2][j] + stairs[i - 1][j + 1]) % 1000000000;
                        // 앞자리 1의 경우, 2번째 전의 행 앞자리 1값 + 1개 행 전의 앞자리 2의 값
                    } else if (j == 8) {
                        stairs[i][j] = (stairs[i - 1][j - 1]) % 1000000000;
                        // 앞자리가 9의 경우, 1행 전의 앞자리가 8인 계단수들이다
                    } else {
                        stairs[i][j] = (stairs[i - 1][j - 1] + stairs[i - 1][j + 1]) % 1000000000;
                        // 앞자리가 1과 9가 아닌 경우, 1행 전의 해당 숫자의 전 숫자 값과 다음 숫자 값의 합
                    }
                }
            }
        }
        for (int i = 0; i < 9; i++)
            sum += stairs[N - 1][i];
        bw.write(String.valueOf(sum % 1000000000));
        br.close();
        bw.close();
    }
}
