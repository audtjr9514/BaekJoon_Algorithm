import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1932 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] tri;

    static void Triangle(int n) throws IOException {
        // 삼각형의 단계는 0 ~ n-1까지 있다 (총 n단계)
        int start = 1;
        while (start < n) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i <= start; i++) {
                // 각 단계의 0번째는 전단계의 0번째 원소만 더할수 있다.
                if (i == 0)
                    tri[start][0] = Integer.parseInt(st.nextToken()) + tri[start - 1][0];
                // 각단계의 첫번째와 마지막 번째를 제외하고는 전단계의 같은 번째나 전 번째의 둘 중 큰 값을 골라서 더한다.
                else if (i == start)
                    tri[start][i] = Integer.parseInt(st.nextToken()) + tri[start - 1][i - 1];
                // 각 단계의 마지막 번째는 전단계의 마지막번째(i-1) 원소만 더할수 있다.
                else
                    tri[start][i] = Integer.parseInt(st.nextToken()) + Math.max(tri[start - 1][i - 1], tri[start - 1][i]);
            }
            start++; //  단계 상승
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        tri = new int[N][N];
        tri[0][0] = Integer.parseInt(br.readLine()); // 단계의 1번째 숫자 입력
        Triangle(N);
        Arrays.sort(tri[N - 1]);
        bw.write(String.valueOf(tri[N - 1][N - 1]));

        br.close();
        bw.close();
    }
}
