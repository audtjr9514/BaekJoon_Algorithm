import java.io.*;
import java.util.*;

public class bj_1753 {
    static class Node implements Comparable<Node> {
        int Edge, Weight;

        public Node(int Edge, int Weight) {
            this.Edge = Edge;
            this.Weight = Weight;
        }

        @Override
        public int compareTo(Node o) { //우선순위큐(PriorityQueue)에서 가중치 오름차순으로 정렬
            return Weight - o.Weight;
        }
    }

    static int V; // 정점의 갯수
    static int E; // 간선의 갯수
    static int K; // 시작하는 정점 번호
    static List<Node>[] vertexList; // 그래프
    static int[] dist; // 거리 배열
    static boolean[] visited;
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());
        vertexList = new ArrayList[V + 1];
        dist = new int[V + 1];

        Arrays.fill(dist, INF);

        for (int i = 1; i < V + 1; i++) {
            vertexList[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int Edge = Integer.parseInt(st.nextToken());
            int Weight = Integer.parseInt(st.nextToken());
            vertexList[start].add(new Node(Edge, Weight));
        }

        dijkstra(K);

        for (int i = 1; i < V + 1; i++) {
            if (dist[i] == INF)
                bw.write("INF");
            else
                bw.write(String.valueOf(dist[i]));
            bw.newLine();
        }

        bw.close();
    }

    public static void dijkstra(int start) {
        PriorityQueue<Node> queue = new PriorityQueue<>();
        visited = new boolean[V + 1];

        queue.add(new Node(start, 0));
        dist[start] = 0;

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            int current = currentNode.Edge;
            if (visited[current])
                continue;
            visited[current] = true;

            for (Node tempNode : vertexList[current]) {
                if (dist[tempNode.Edge] > dist[current] + tempNode.Weight) {
                    dist[tempNode.Edge] = dist[current] + tempNode.Weight;
                    queue.add(new Node(tempNode.Edge, dist[tempNode.Edge]));
                }
            }
        }
    }
}