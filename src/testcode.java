import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class testcode {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];

        dfs(0, "");
    }

    static int M, N;
    static boolean[] visited;

    static void dfs(int counts, String ans) {

        if (counts == M) {
            System.out.println(ans.substring(1));
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(counts + 1, ans + " " + i);
                visited[i] = false;
            }
        }
    }
}
