import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class bj_1753 {
    // 그래프 노드
    static class Node implements Comparable<Node> {
        int Edge;
        int weight;

        public Node(int Edge, int weight) {
            this.Edge = Edge;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return weight - o.weight;
        }
    }

    static int V; // 정점의 갯수
    static int E; // 간선의 개수
    static int start; // 시작 정점
    static ArrayList<Node>[] vertexList; // 그래프
    static int[] distance; // 거리 저장 배열
    static boolean[] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken()); // 정점 갯수 입력
        E = Integer.parseInt(st.nextToken()); // 간선 갯수 입력
        start = Integer.parseInt(br.readLine()); // 시작 정점 입력

        vertexList = new ArrayList[V + 1]; // 그래프
        distance = new int[V + 1]; // 거리 저장 배열 생성
        Arrays.fill(distance, Integer.MAX_VALUE);// 거리 배열 초기화
        for (int i = 1; i <= V; i++) {
            vertexList[i] = new ArrayList<>();
            distance[i] = Integer.MAX_VALUE;
        }
        // 그래프 입력
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            vertexList[u].add(new Node(v, w));
        }

        dijkstra(start);

        for (int i = 1; i < V + 1; i++) {
            if (distance[i] < Integer.MAX_VALUE)
                bw.write(String.valueOf(distance[i]));
            else
                bw.write("INF");
            bw.newLine();
        }
        br.close();
        bw.close();
    }

    public static void dijkstra(int start) {
        // 큐에 시작 정점 입력
        PriorityQueue<Node> queue = new PriorityQueue<>(); // 정점마다 인접한 정점들을 넣어줄 우선순위 큐

        visited = new boolean[V + 1];
        queue.offer(new Node(start, distance[start]));
        distance[start] = 0;
        while (!queue.isEmpty()) {
            // 다음에 방문할 정점
            Node vertex = queue.poll();
            // 방문한 정점 체크
            if (visited[vertex.Edge] == true)
                continue;
            visited[vertex.Edge] = true;
            for (Node tempNode : vertexList[vertex.Edge]) {

                // 이전의 거리 값이 더 크다면 굳이 다시 방문 필요 X
                if (distance[tempNode.Edge] > distance[vertex.Edge] + tempNode.weight) {
                    distance[tempNode.Edge] = Math.min(distance[tempNode.Edge], tempNode.weight + distance[vertex.Edge]);
                    queue.add(tempNode);
                }
            }
        }
    }
}
