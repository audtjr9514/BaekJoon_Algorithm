import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Doc implements Comparable<Doc> {
    int index;
    int priority;

    public Doc(int priority, int index) {
        this.priority = priority;
        this.index = index;
    }

    @Override
    public int compareTo(Doc target) {
        if (this.priority < target.priority) {
            return 1;
        } else if (this.priority == target.priority) {
            if (this.index > target.index)
                return -1;
            else
                return 1;
        } else
            return -1;
    }

    @Override
    public String toString() {
        return String.valueOf(index);
    }
}

public class bj_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());
        int numbers;
        int chk;
        for (int i = 0; i < testcase; i++) {
            st = new StringTokenizer(br.readLine());
            numbers = Integer.parseInt(st.nextToken());
            chk = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            PriorityQueue<Doc> printQ = new PriorityQueue<>();
            for (int j = 0; j < numbers; j++) {
                printQ.offer(new Doc(Integer.parseInt(st.nextToken()), j));
            }
            int index = 1;
            while (!printQ.isEmpty())
                if (chk != printQ.poll().index) {
                    index++;
                } else
                    break;
            bw.write(index + "\n");
        }
        br.close();
        bw.close();
    }
}

