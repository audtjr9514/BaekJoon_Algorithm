import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        int[] counts = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            counts[i] = 1;
            for (int j = 0; j < i; j++) {
                if (numbers[i] > numbers[j] && counts[i] <= counts[j])
                    counts[i] = counts[j] + 1;
                else if (numbers[i] == numbers[j])
                    counts[i] = counts[j];
            }
        }
        int max = 0;
        for (int c : counts)
            if (max < c)
                max = c;
        bw.write(String.valueOf(max));
        br.close();
        bw.close();
    }
}
