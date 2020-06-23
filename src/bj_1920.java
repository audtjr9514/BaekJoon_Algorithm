import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            boolean chk = false;
            int findNum = Integer.parseInt(st.nextToken());
            int left = 0, right = N - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] > findNum)
                    right = mid - 1;
                else if (arr[mid] < findNum)
                    left = mid + 1;
                else {
                    chk = true;
                    break;
                }
            }
            if (chk)
                bw.write("1\n");
            else
                bw.write("0\n");
        }

        br.close();
        bw.close();
    }
}
