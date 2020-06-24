import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 상근이 가진 카드
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[20000001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[Integer.parseInt(st.nextToken()) + 10000000]++;
        // 숫자 카드
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++)
            sb.append(arr[Integer.parseInt(st.nextToken()) + 10000000] + " ");
        // 출력
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
