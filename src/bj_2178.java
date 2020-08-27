import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

class XY {
    int x;
    int y;

    public XY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class bj_2178 {
    static int[] dx = {-1, 1, 0, 0}; // x의 상하좌우
    static int[] dy = {0, 0, -1, 1}; // y의 상하좌우
    static int[][] arr;
    static int width;
    static int height;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        height = Integer.parseInt(st.nextToken());
        width = Integer.parseInt(st.nextToken());
        arr = new int[height][width];
        visited = new boolean[height][width];
        for (int i = 0; i < height; i++) {
            String[] inputLine = br.readLine().split("");
            for (int j = 0; j < width; j++)
                arr[i][j] = Integer.parseInt(inputLine[j]);
        }
        BFS(0, 0);
        bw.write(String.valueOf(arr[height - 1][width - 1]));

        br.close();
        bw.close();
    }


    static void BFS(int x, int y) {
        Queue<XY> path = new LinkedList<>();
        path.offer(new XY(x, y));
        visited[0][0] = true;

        while (!path.isEmpty()) {
            XY pos = path.poll();
            for (int i = 0; i < 4; i++) {
                int tempX = pos.x + dx[i];
                int tempY = pos.y + dy[i];
                if (0 <= tempX && tempX < height && 0 <= tempY && tempY < width)
                    if (arr[tempX][tempY] != 0 && !visited[tempX][tempY]) {
                        path.offer(new XY(tempX, tempY));
                        visited[tempX][tempY] = true;
                        arr[tempX][tempY] = arr[pos.x][pos.y] + 1;
                    }
            }
        }
    }
}
