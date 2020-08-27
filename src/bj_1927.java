import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class bj_1927{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue minHeap = new PriorityQueue();

        for (int i = 0; i < N; i++) {
            int X = Integer.parseInt(br.readLine());
            if (X > 0) {
                minHeap.offer(X);
            } else {
                if (minHeap.peek() != null) {
                    bw.write(String.valueOf(minHeap.poll()));
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
