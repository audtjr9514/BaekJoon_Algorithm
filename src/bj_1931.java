import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.Arrays;

public class bj_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] conf = new int[N][2];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            conf[i][0] = Integer.parseInt(st.nextToken());
            conf[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(conf, (int[] x1, int[] x2) -> {
                    if (x1[1] > x2[1])
                        return 1;
                    else if (x1[1] == x2[1])
                        if (x1[0] < x2[0])
                            return 1;

                    return -1;
                }
        );

        int start = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (conf[i][0] >= start) {
                start = conf[i][1];
                count++;
            }
        }
        bw.write(String.valueOf(count));

        br.close();
        bw.close();
    }
}