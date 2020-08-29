/*
기존의 토마토 문제와 같으나 3차원으로 위와 아래까지 생각해야함
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import java.util.LinkedList;
import java.util.Queue;

class XY_2 {
    int x;
    int y;
    int z;
    int day;

    public XY_2(int x, int y, int z, int day) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.day = day;
    }
}

public class bj_7569 {
    static int[] dx = {0, 1, 0, -1, 0, 0};
    static int[] dy = {1, 0, -1, 0, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    static int[][][] arr;
    static int width;
    static int height;
    static int stair;
    static int Day;
    static Queue<XY_2> tomato = new LinkedList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        width = Integer.parseInt(st.nextToken());
        height = Integer.parseInt(st.nextToken());
        stair = Integer.parseInt(st.nextToken());

        arr = new int[stair][height][width];
        for (int i = 0; i < stair; i++) {
            for (int j = 0; j < height; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < width; k++) {
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                    if (arr[i][j][k] == 1)
                        tomato.add(new XY_2(j, k, i, 0)); //day를 큐에 함께 넘겨주는 것이 관건!
                }
            }
        }
        BFS(0, 0, 0);
        if (checkTomato())
            bw.write(String.valueOf(Day));
        else
            bw.write(String.valueOf(-1));
        br.close();
        bw.close();
    }

    static void BFS(int x, int y, int z) {
        Day = 0;
        while (!tomato.isEmpty()) {
            XY_2 pos = tomato.poll();
            Day = pos.day;
            for (int i = 0; i < 6; i++) {
                int tempX = pos.x + dx[i];
                int tempY = pos.y + dy[i];
                int tempZ = pos.z + dz[i];
                if (0 <= tempX && tempX < height && 0 <= tempY && tempY < width && 0 <= tempZ && tempZ < stair)
                    if (arr[tempZ][tempX][tempY] == 0) {
                        tomato.offer(new XY_2(tempX, tempY, tempZ, Day + 1));
                        arr[tempZ][tempX][tempY] = 1;
                    }
            }
        }
    }

    public static boolean checkTomato() {
        for (int i = 0; i < stair; i++) {
            for (int j = 0; j < height; j++) {
                for (int k = 0; k < width; k++) {
                    if (arr[i][j][k] == 0)
                        return false;
                }
            }
        }
        return true;
    }
}
