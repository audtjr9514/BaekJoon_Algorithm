import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] dequeue = new int[3 * N];
        for (int i = 0; i < N; i++)
            dequeue[i] = i + 1;
        int front = 0;
        int rear = N - 1;
        while (true) {
            if(N==1)
                break;
            front++;
            if (front == rear)
                break;
            dequeue[++rear] = dequeue[front];
            front++;
        }
        bw.write(String.valueOf(dequeue[front]));

        br.close();
        bw.close();
    }
}
