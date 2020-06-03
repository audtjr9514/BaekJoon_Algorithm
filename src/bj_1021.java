import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;


public class bj_1021 {
    static LinkedList<Integer> deque = new LinkedList<>();

    static void right() {
        deque.addFirst(deque.pollLast());
    }

    static void left() {
        deque.addLast(deque.pollFirst());
    }

    static int findIndex(int chk) {
        int current = 0;
        for (int j = 0; j < deque.size(); j++) {
            if (deque.get(j) == chk) {
                current = j;
                break;
            }
        }
        return current;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int totalNum = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= totalNum; i++)
            deque.offer(i);
        int testcase = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int chk;
        int count = 0;
        for (int i = 0; i < testcase; i++) {
            chk = Integer.parseInt(st.nextToken());
            int halfSize = deque.size() % 2 == 0 ? deque.size() / 2 - 1 : deque.size() / 2;
            if (deque.getFirst() == chk)
                deque.poll();
            else {
                int current = findIndex(chk);
                if (halfSize - current >= 0) {
                    for (int j = 0; j < current; j++) {
                        left();
                        count++;
                    }
                    deque.poll();
                } else {
                    for (int j = 0; j < deque.size() - current; j++) {
                        right();
                        count++;
                    }
                    deque.poll();
                }
            }
        }
        bw.write(String.valueOf(count));
        br.close();
        bw.close();
    }
}
