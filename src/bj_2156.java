import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int drinks[] = new int[N];
        int result[] = new int[N];
        for (int i = 0; i < N; i++)
            drinks[i] = Integer.parseInt(br.readLine());
        if (N >= 1)
            result[0] = drinks[0];
        if (N >= 2)
            result[1] = drinks[0] + drinks[1];
        if (N >= 3)
            result[2] = Math.max(Math.max(drinks[0] + drinks[2], drinks[1] + drinks[2]), result[1]);
        if (N >= 4) {
            for (int i = 3; i < N; i++) {
                result[i] = Math.max(Math.max(result[i - 2] + drinks[i], result[i - 3] + drinks[i - 1] + drinks[i]), result[i - 1]);
            }
        }
        bw.write(String.valueOf(result[N - 1]));

        br.close();
        bw.close();
    }

}
