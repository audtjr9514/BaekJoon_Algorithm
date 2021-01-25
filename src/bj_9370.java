import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class bj_9370 {
    static class Node implements Comparable<Node> {
        int end, weight;

        public Node(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return weight - o.weight;
        }
    }

    static int n; // 교차로 갯수 = 정점의 수
    static int m; // 도로의 갯수 = 간선의 수
    static int t; // 목적지 후보의 개수
    static int start; // 시작점
    static int g, h; // 무조건 포함해야할 정점
    static final int INF = Integer.MAX_VALUE;
    static List<Node>[] vertexList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            t = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            g = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            vertexList = new ArrayList[n + 1];
            for (int j = 1; j < n + 1; j++)
                vertexList[i] = new ArrayList<>();
            

        }

        br.close();
        bw.close();
    }
}
