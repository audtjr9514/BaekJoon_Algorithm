import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class bj_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> abHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer n = Math.abs(o1);
                Integer m = Math.abs(o2);
                if (n < m) {
                    return -1;
                } else if (n > m) {
                    return 1;
                } else {
                    if (o1 < o2) {
                        return -1;
                    } else if (o1 > o2) {
                        return 1;
                    } else {
                        return 0;
                    }
                }

            }
        });
        for (int i = 0; i < N; i++) {
            int X = Integer.parseInt(br.readLine());
            if (X == 0)
                if (abHeap.isEmpty() == true)
                    bw.write(0 + "\n");
                else
                    bw.write(abHeap.poll() + "\n");
            else
                abHeap.offer(X);
        }

        br.close();
        bw.close();
    }
}
