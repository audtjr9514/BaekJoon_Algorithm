import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.StringTokenizer;
import java.util.Deque;

public class bj_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if (deque.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(deque.pollFirst() + "\n");
                    break;
                case "pop_back":
                    if (deque.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(deque.pollLast() + "\n");
                    break;
                case "size":
                    bw.write(deque.size() + "\n");
                    break;
                case "empty":
                    if (deque.isEmpty())
                        bw.write("1\n");
                    else
                        bw.write("0\n");
                    break;
                case "front":
                    if (deque.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(deque.getFirst() + "\n");
                    break;
                case "back":
                    if (deque.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(deque.getLast() + "\n");
                    break;
            }
        }

        br.close();
        bw.close();
    }
}
