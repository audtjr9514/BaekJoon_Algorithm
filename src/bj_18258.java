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
                    break;
                case "size":
                    break;
                case "empty":
                    break;
                case "front":
                    break;
                case "back":
                    break;
            }
        }
        br.close();
        bw.close();
    }
}