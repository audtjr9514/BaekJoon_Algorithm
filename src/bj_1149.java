import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class bj_1149 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] rgb = new int[2][3];

    static void RGB(int n) throws IOException {
        while (n > 2) {
            for (int i = 0; i < 3; i++) {
                st = new StringTokenizer(br.readLine());
                rgb[1][0] = Integer.parseInt(st.nextToken()) + Math.min(rgb[0][1], rgb[0][2]);
                rgb[1][1] = Integer.parseInt(st.nextToken()) + Math.min(rgb[0][0], rgb[0][2]);
                rgb[1][2] = Integer.parseInt(st.nextToken()) + Math.min(rgb[0][0], rgb[0][1]);

                rgb[0][0] = rgb[1][0];
                rgb[0][1] = rgb[1][1];
                rgb[0][2] = rgb[1][2];
            }
            n--;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++)
            rgb[0][i] = Integer.parseInt(st.nextToken());

        RGB(N);
        Arrays.sort(rgb[1]);
        bw.write(String.valueOf(rgb[1][0]));

        br.close();
        bw.close();
    }
}
