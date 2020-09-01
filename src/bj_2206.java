import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class bj_2206 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int height;
    static int width;
    static int total;
    static int[][] arr;
    static int[][] visited;
    static Queue<walls> path;

    static class walls {
        int x;
        int y;
        int move;
        int pass;

        public walls(int x, int y, int move, int pass) {
            this.x = x;
            this.y = y;
            this.move = move;
            this.pass = pass;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        height = Integer.parseInt(st.nextToken());
        width = Integer.parseInt(st.nextToken());
        arr = new int[height][width];
        visited = new int[height][width];
        for (int i = 0; i < height; i++) {
            String[] inputLine = br.readLine().split("");
            for (int j = 0; j < width; j++) {
                arr[i][j] = Integer.parseInt(inputLine[j]);
                visited[i][j] = Integer.MAX_VALUE;
            }
        }
        total = Integer.MAX_VALUE;
        path = new LinkedList<>();
        BFS();
        if (total == Integer.MAX_VALUE)
            bw.write(String.valueOf(-1));
        else
            bw.write(String.valueOf(total));
        br.close();
        bw.close();
    }

    static void BFS() {
        path.offer(new walls(0, 0, 1, 0));
        visited[0][0] = 0;

        while (!path.isEmpty()) {
            walls wall = path.poll();

            if (wall.x == height - 1 && wall.y == width-1) {
                total = wall.move;
                break;
            }

            for (int k = 0; k < 4; k++) {
                int tempX = wall.x + dx[k];
                int tempY = wall.y + dy[k];

                if (tempX < 0 || tempX >= height || tempY < 0 || tempY >= width)
                    continue;
                if (visited[tempX][tempY] <= wall.pass)
                    continue;

                if (arr[tempX][tempY] == 0) {
                    visited[tempX][tempY] = wall.pass;
                    path.add(new walls(tempX, tempY, wall.move + 1, wall.pass));
                } else {
                    if (wall.pass == 0) {
                        visited[tempX][tempY] = wall.pass + 1;
                        path.add(new walls(tempX, tempY, wall.move + 1, wall.pass + 1));
                    }
                }
            }
        }
    }
}
