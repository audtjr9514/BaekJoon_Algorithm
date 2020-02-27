import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_15649 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int M;
    static boolean[] visited;

    public static void sequence(int counts, String ans ) throws IOException {
        if(counts == M) {
            System.out.println(ans.substring(1));
            return;
        }

        for(int i = 1 ; i <= N ; i++ ) {
            if(!visited[i]) {
                visited[i] = true;
                sequence(counts+1, ans +" "+ i);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        N = br.read();
        M = br.read();
        visited = new boolean[N + 1];

        sequence(0, "");

        br.close();
        bw.close();
    }
}
