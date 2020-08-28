import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

class XY_1 {
    int x;
    int y;
    int day;

    public XY_1(int x, int y, int day) {
        this.x = x;
        this.y = y;
        this.day = day;
    }
}

public class bj_7576 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] arr;
    static int width;
    static int height;
    static int Day;
    static Queue<XY_1> tomato = new LinkedList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        width = Integer.parseInt(st.nextToken());
        height = Integer.parseInt(st.nextToken());
        arr = new int[height][width];
        for (int i = 0; i < height; i++) {
            String str[] = br.readLine().split(" ");
            for (int j = 0; j < width; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
                if (arr[i][j] == 1)
                    tomato.add(new XY_1(i, j, 0));
            }
        }
        BFS(0, 0);

        if (checkTomato())
            bw.write(String.valueOf(Day));
        else
            bw.write(String.valueOf(-1));

        br.close();
        bw.close();
    }

    static void BFS(int x, int y) {
        Day = 0;
        while (!tomato.isEmpty()) {
            XY_1 pos = tomato.poll();
            Day = pos.day;
            for (int i = 0; i < 4; i++) {
                int tempX = pos.x + dx[i];
                int tempY = pos.y + dy[i];
                if (0 <= tempX && tempX < height && 0 <= tempY && tempY < width)
                    if (arr[tempX][tempY] == 0) {
                        tomato.offer(new XY_1(tempX, tempY, Day + 1));
                        arr[tempX][tempY] = 1;
                    }
            }
        }
    }

    public static boolean checkTomato() {
        for (int[] Height : arr) {
            for (int Width : Height) {
                if (Width == 0)
                    return false;
            }
        }
        return true;
    }
}
