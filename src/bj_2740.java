import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_2740 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A_c = Integer.parseInt(st.nextToken());
        int A_r = Integer.parseInt(st.nextToken());
        int[][] A = new int[A_c][A_r];
        for (int i = 0; i < A_c; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < A_r; j++)
                A[i][j] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int B_c = Integer.parseInt(st.nextToken());
        int B_r = Integer.parseInt(st.nextToken());
        int[][] B = new int[B_c][B_r];

        for (int i = 0; i < B_c; i++) {
            StringTokenizer st4 = new StringTokenizer(br.readLine());
            for (int j = 0; j < B_r; j++) {
                B[i][j] = Integer.parseInt(st4.nextToken());
            }
        }

        for (int i = 0; i < A_c; i++) {
            for (int j = 0; j < B_r; j++) {
                int result = 0;
                for (int k = 0; k < A_r; k++) {
                    result += A[i][k] * B[k][j];
                }
                bw.write(result + " ");
            }
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
