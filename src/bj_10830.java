import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_10830 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                matrix[i][j] = Integer.parseInt(st.nextToken());
        }

        int[][] result = square(matrix, N, B);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] %= 1000;
                bw.write(result[i][j] + " ");
            }
            bw.newLine();
        }

        br.close();
        bw.close();
    }

    static int[][] cal(int[][] A, int[][] B, int N) {
        int[][] temp = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int result = 0;
                for (int k = 0; k < N; k++)
                    result += (A[i][k] * B[k][j]);
                temp[i][j] = result % 1000;
            }
        }
        return temp;
    }

    static int[][] square(int[][] matrix, int N, long B) {
        if (B == 1)
            return matrix;
        else if (B == 2)
            return cal(matrix, matrix, N);
        else {
            int[][] result = square(matrix, N, B / 2);
            if (B % 2 == 0)
                return cal(result, result, N);
            else
                return cal(matrix, cal(result, result, N), N);
         }
    }
}
