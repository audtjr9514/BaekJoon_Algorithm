import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_1012 {
    static int[] dx = {-1, 1, 0, 0}; // x의 상하좌우
    static int[] dy = {0, 0, -1, 1}; // y의 상하좌우
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            int cabbage = Integer.parseInt(st.nextToken());
            int[][] arr = new int[width][height];
            for (int j = 0; j < cabbage; j++) {
                st = new StringTokenizer(br.readLine());
                arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }
            int count = 0;
            for (int j = 0; j < width; j++) {
                for (int k = 0; k < height; k++) {
                    if (arr[j][k] == 1) {
                        DFS(j, k, arr, width, height);
                        count++;
                    }
                }
            }
            bw.write(String.valueOf(count));
            bw.newLine();

        }
        br.close();
        bw.close();
    }

    static void DFS(int x, int y, int[][] arr, int width, int height) {
        arr[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int tempX = x + dx[i];
            int tempY = y + dy[i];

            if (0 <= tempX && tempX < width && 0 <= tempY && tempY < height) {
                if (arr[tempX][tempY] == 1) DFS(tempX, tempY, arr, width, height);
            }
        }
    }
}
