/*
1753번과 유사하나 중간에 node1, node2를 필수로 들러야하는 조건이 추가
최단경로는 밑의 둘 중 하나의 경로가 됨
ex1 ) 1 → (...) → node1 → (...) → node2 → (...) → N
ex2 ) 1 → (...) → node2 → (...) → node1 → (...) → N

그러므로 각각 1, node1, node2를 각각 출발접으로 하는 다익스트라를 3번 돌리면 됨
1번의 경우 ex1)
1 → (1->node1까지의 다익스트라) →
node1 → (node1->node2까지의 다익스트라) →
node2 → (node2->N까지의 다익스트라) → N
각 다익스트라를 더해주면 된다.

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class bj_1504 {
    static class Node implements Comparable<Node> {
        int Edge, Weight;

        public Node(int Edge, int Weight) {
            this.Edge = Edge;
            this.Weight = Weight;
        }

        @Override
        public int compareTo(Node o) {
            return Weight - o.Weight;
        }
    }

    static int V;
    static int E;
    static int v1, v2;
    static List<Node>[] vertexList;
    static int[] distance;
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        vertexList = new ArrayList[V + 1];
        distance = new int[V + 1];
        for (int i = 1; i < V + 1; i++) {
            vertexList[i] = new ArrayList<>();
        }
        Arrays.fill(distance, INF);
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            vertexList[start].add(new Node(end, weight));
            vertexList[end].add(new Node(start, weight));
        }
        st = new StringTokenizer(br.readLine());
        v1 = Integer.parseInt(st.nextToken());
        v2 = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(solve(v1, v2)));

        br.close();
        bw.close();
    }

    static int dijkstra(int start, int end) {
        boolean[] visited = new boolean[V + 1]; //각 점들의 방문 여부
        Arrays.fill(distance, INF);
        Arrays.fill(visited, false);

        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(start, 0));
        distance[start] = 0;

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            int curNode = tempNode.Edge;
            int curWeight = tempNode.Weight;

            if (visited[curNode] == true) continue;
            visited[curNode] = true;

            for (int i = 0; i < vertexList[curNode].size(); i++) {
                int nextNode = vertexList[curNode].get(i).Edge;
                int nextWeight = vertexList[curNode].get(i).Weight;
                if (visited[nextNode] == false && distance[nextNode] > curWeight + nextWeight) {
                    distance[nextNode] = curWeight + nextWeight;
                    queue.add(new Node(nextNode, distance[nextNode]));
                }
            }
        }
        return distance[end];
    }

    private static int solve(int required1, int required2) {
        int result1 = 0;
        int result2 = 0;

        result1 += dijkstra(1, required1);
        result1 += dijkstra(required1, required2);
        result1 += dijkstra(required2, V);

        result2 += dijkstra(1, required2);
        result2 += dijkstra(required2, required1);
        result2 += dijkstra(required1, V);

        if (result1 >= INF && result2 >= INF)
            return -1;
        else
            return Math.min(result1, result2);
    }
}
