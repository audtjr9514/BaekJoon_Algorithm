import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

public class bj_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue maxHeap = new PriorityQueue(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int X = Integer.parseInt(br.readLine());
            if (X > 0) {
                maxHeap.offer(X);
            } else {
                if (maxHeap.peek() != null) {
                    bw.write(String.valueOf(maxHeap.poll()));
                    bw.newLine();
                } else {
                    bw.write("0");
                    bw.newLine();
                }
            }
        }

        br.close();
        bw.close();
    }
}
