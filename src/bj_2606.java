import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class bj_2606 {
    static LinkedList<Integer>[] Nodes;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        Nodes = new LinkedList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 0; i < N + 1; i++)
            Nodes[i] = new LinkedList<>();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st.nextToken());
            int line = Integer.parseInt(st.nextToken());

            Nodes[node].add(line);
            Nodes[line].add(node);
        }
        DFS(1);
        bw.write(String.valueOf(count-1));
        br.close();
        bw.close();
    }

    static void DFS(int v) {
        if (visited[v])
            return;
        visited[v] = true;
        count++;
        for (int node : Nodes[v])
            DFS(node);
    }
}