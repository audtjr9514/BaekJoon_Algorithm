import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_2580 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[][] sdoku = new int[9][9];// 초기 입력
    static boolean[][] rows = new boolean[9][10]; // 행 숫자 체크
    static boolean[][] cols = new boolean[9][10]; // 열 숫자 체크
    static boolean[][] smalls = new boolean[10][10]; // 작은 사각형 체크

    static void back(int row, int col) throws IOException {
        if (col == 9) {
            col = 0;
            row++;
        }
        if (row == 9) {
            for (int line[] : sdoku) {
                for (int lang : line)
                    bw.write(lang + " ");
                bw.newLine();
            }
            bw.close();
            System.exit(0);
        }

        if (sdoku[row][col] == 0) {
            for (int i = 1; i < 10; i++)
                if (!rows[row][i] && !cols[col][i] && !smalls[(row / 3) * 3 + col / 3][i]) {
                    rows[row][i] = true;
                    cols[col][i] = true;
                    smalls[(row / 3) * 3 + col / 3][i] = true;
                    sdoku[row][col] = i;
                    back(row, col + 1);
                    sdoku[row][col] = 0;
                    rows[row][i] = false;
                    cols[col][i] = false;
                    smalls[(row / 3) * 3 + col / 3][i] = false;
                }
        } else
            back(row, col + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                sdoku[i][j] = Integer.parseInt(st.nextToken());
                if (sdoku[i][j] != 0) {
                    rows[i][sdoku[i][j]] = true; // 해당 행의 숫자를 체크
                    cols[j][sdoku[i][j]] = true; // 해당 열의 숫자를 체크
                    smalls[(i / 3) * 3 + j / 3][sdoku[i][j]] = true; // 해당하는 작은 사각형의 숫자를 체크;
                }
            }
        }
        br.close();
        back(0, 0);
    }
}
