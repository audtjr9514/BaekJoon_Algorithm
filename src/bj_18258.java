import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_18258 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] queue = new int[N];
        int front = 0;
        int rear = -1;
        int num;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    num = Integer.parseInt(st.nextToken());
                    queue[++rear] = num;
                    break;
                case "pop":
                    if (rear == front - 1)
                        bw.write(String.valueOf(-1) + '\n');
                    else
                        bw.write(String.valueOf(queue[front++]) + '\n');
                    break;
                case "size":
                    if (rear - front >= 0)
                        bw.write(String.valueOf(rear - front + 1) + '\n');
                    else
                        bw.write(String.valueOf(0) + '\n');
                    break;
                case "empty":
                    if (rear == front - 1)
                        bw.write(String.valueOf(1) + '\n');
                    else
                        bw.write(String.valueOf(0) + '\n');
                    break;
                case "front":
                    if (rear == front - 1)
                        bw.write(String.valueOf(-1) + '\n');
                    else
                        bw.write(String.valueOf(queue[front]) + '\n');
                    break;
                case "back":
                    if (rear == front - 1)
                        bw.write(String.valueOf(-1) + '\n');
                    else
                        bw.write(String.valueOf(queue[rear]) + '\n');
                    break;
            }
        }
        br.close();
        bw.close();
    }
}