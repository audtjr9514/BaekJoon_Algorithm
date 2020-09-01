import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1753 {
    static class Graph implements Comparable<Graph> {
        int Graph;
        int weight;

        public Graph(int Graph, int weight) {
            this.Graph = Graph;
            this.weight = weight;
        }

        @Override
        public int compareTo(Graph o) {
            if (this.weight > o.weight) return 1;
            else if (this.weight == o.weight) return 0;
            else return -1;
        }
    }

    static int V;
    static int E;
    static int start;
    static ArrayList<Graph>[] vertexList;
    static int[] distance;
    static boolean[] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine();
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(br.readLine());

        vertexList = new ArrayList[V + 1];
        distance = new int[V + 1];
        visited = new boolean[V + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        ArrayList<Graph>[] list = new ArrayList[V + 1];

        br.close();
        bw.close();
    }
}
