import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] set = new int[5];

        for (int i = 0; i < set.length; i++)
            set[i] = Integer.parseInt(br.readLine());
        int burger;
        if (set[0] <= set[1] && set[0] <= set[2]) {
            burger = set[0];
        } else if (set[1] <= set[0] && set[1] <= set[2]) {
            burger = set[1];
        } else {
            burger = set[2];
        }
        int drink = set[3] <= set[4] ? set[3] : set[4];

        bw.write(String.valueOf(burger + drink - 50));

        br.close();
        bw.close();
    }
}
