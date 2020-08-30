import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class bj_1697 {
    static int N;
    static int K;
    static int[] visited;
    static int count;
    static Queue<Integer> path;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visited = new int[100001];
        visited[N] = 0;

        path = new LinkedList<>();
        path.add(N);
        BFS();

        bw.write(String.valueOf(visited[K]));
        br.close();
        bw.close();
    }

    static void BFS() {
        while (!path.isEmpty()) {
            N = path.poll();
            if (N == K)
                break;
            else {
                int[] coordinate = {N + 1, N - 1, N * 2};
                for (int i = 0; i < 3; i++) {
                    int x = coordinate[i];
                    if (x >= 0 && x <= 100000) {
                        if (visited[x] == 0) {
                            visited[x] = visited[N] + 1;
                            path.add(x);
                        }
                    }
                }
            }
        }


    }

}
