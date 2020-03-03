import java.io.*;

public class ss {
    public static String[][] arr = new String[9][9];
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine().split(" ");
        }

        backtracking(0);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.newLine();
        }
        bw.close();

    }

    public static void backtracking(int level) throws IOException {
        if (level == arr.length) return;
        else {
            for (int i = 0; i < 9; i++) { //level은 백트래킹하며 ++, 열만 for문으로 탐색
                if (arr[level][i].equals("0")) { //0인 부분의 숫자를 탐색
                    arr[level][i] = String.valueOf(findNum(level, i)); //0인 부분 숫자를 찾고
                    backtracking(level + 1); //다음 행을 탐색
                }
            }
        }
    }

    public static int findNum(int row, int col) {
        boolean[] visited = new boolean[10]; //1~9까지 숫자가 사용됐는지 체크
        int i;
        checkGaro(row, visited);
        checkSero(col, visited);
        checkSquare(row, col, visited);

        for (i = 1; i < visited.length; i++)
            if (visited[i] != true) return i;
        return i;
    }

    public static boolean[] checkGaro(int row, boolean[] visited) {
        for (int i = 0; i < 9; i++) {
            visited[Integer.parseInt(arr[row][i])] = true;
        }
        return visited;
    }

    public static boolean[] checkSero(int col, boolean[] visited) {
        for (int i = 0; i < 9; i++) {
            visited[Integer.parseInt(arr[i][col])] = true;
        }
        return visited;
    }

    public static boolean[] checkSquare(int row, int col, boolean[] visited) {
        row = (row / 3) * 3;
        col = (col / 3) * 3;

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                visited[Integer.parseInt(arr[i][j])] = true;
            }
        }
        return visited;
    }

}