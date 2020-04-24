import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class bj_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Queue<Integer> Josephus = new LinkedList<>();
        int chk = Integer.parseInt(st.nextToken()) - 1;
        for (int i = 0; i < N; i++)
            Josephus.offer(i + 1);
        bw.write("<");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < chk; j++) {
                Josephus.offer(Josephus.peek());
                Josephus.remove();
            }
            bw.write(String.valueOf(Josephus.peek()));
            Josephus.remove();
            if (i != N - 1)
                bw.write(", ");
        }
        bw.write(">");
        br.close();
        bw.close();
    }
}
