import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class bj_2667 {
    static int[] dx = {-1, 1, 0, 0}; // x의 상하좌우
    static int[] dy = {0, 0, -1, 1}; // y의 상하좌우
    static int N; // 배열의 크기
    static int[][] arr;
    static int count = 0; // 총 단지의 개수
    static int size = 0; // 각 단지별 크기를 체크할 변수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        // 배열 입력
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            String inputLine = br.readLine();
            String[] str = inputLine.split("");
            for (int j = 0; j < N; j++)
                arr[i][j] = Integer.parseInt(str[j]);
        }
        // arrSize = 각 단지별 크기를 저장할 배열
        ArrayList<Integer> arrSize = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                if (arr[i][j] == 1) {
                    DFS(i, j);
                    count++;
                    arrSize.add(size);
                    size = 0;
                }
        }
        // 단지수 출력
        bw.write(count + "\n");
        // 각 단지별 크기 출력
        Collections.sort(arrSize); // 크기순이 아니므로 정렬
        for (int i = 0; i < arrSize.size(); i++)
            bw.write(arrSize.get(i) + "\n");
        br.close();
        bw.close();
    }

    static void DFS(int x, int y) {
        arr[x][y] = 0;
        size++;
        for (int i = 0; i < 4; i++) {
            int tempX = x + dx[i];
            int tempY = y + dy[i];

            if (0 <= tempX && tempX < N && 0 <= tempY && tempY < N) {
                if (arr[tempX][tempY] == 1)
                    DFS(tempX, tempY);
            }
        }
    }
}
