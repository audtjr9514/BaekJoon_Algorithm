import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class bj_1260 {
    static BufferedWriter bw;
    static LinkedList<Integer>[] Nodes;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점 갯수
        int M = Integer.parseInt(st.nextToken()); // 간선 갯수
        int Start = Integer.parseInt(st.nextToken()); // 시작 정점
        // 그래프 초기화
        Nodes = new LinkedList[N + 1];
        for (int i = 0; i <= N; i++)
            Nodes[i] = new LinkedList();
        // 탐색을 위한 방문 체크 배열
        visited = new boolean[N + 1];
        // 양방향 간선 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st.nextToken());
            int line = Integer.parseInt(st.nextToken());
            Nodes[node].add(line);
            Nodes[line].add(node);
            // 정렬하는 이유는 정점번호가 작은 것부터 방문하는 것이 규칙이므로.
            Collections.sort(Nodes[node]);
            Collections.sort(Nodes[line]);
        }


        DFS(Start);
        for (int i = 0; i < N + 1; i++)
            visited[i] = false;
        bw.newLine();
        BFS(Start);

        br.close();
        bw.close();
    }

    public static void DFS(int v) throws IOException {
        if (visited[v])
            return;
        visited[v] = true;
        bw.write(v + " ");
        for (int node : Nodes[v])
            DFS(node);
    }

    public static void BFS(int v) throws IOException {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(v);

        while (!queue.isEmpty()) {
            v = queue.poll();
            if (visited[v]) continue;

            visited[v] = true;
            bw.write(v + " ");

            for (int node : Nodes[v]) {
                queue.add(node);
            }
        }
    }
}

