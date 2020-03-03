import java.io.*;
import java.util.StringTokenizer;

public class testcode {
    public static int[][] arr = new int[9][9];
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

            }
        }

        backtracking(0, 0);


    }

    public static void backtracking(int row, int col) throws IOException {
        if (col == 9) {
            col = 0;
            row++;
        }

        if (row == 9) {
            print();
            System.exit(0); //스도쿠 판을 채우는 방법이 여럿인 경우는 그 중 하나만을 출력하기 위해 시스템 종료
        }


        if (arr[row][col] == 0) { //0인 부분의 숫자를 탐색
            for (int i = 1; i < 10; i++) {
                if (isPossible(row, col, i)) { //0인 부분의 값을 임의로 i를 넣어놓고 그 값이 가능하다고 판단되면
                    arr[row][col] = i;
                    backtracking(row, col + 1);
                    arr[row][col] = 0;
                }
            }
        } else backtracking(row, col + 1);

    }

    public static boolean isPossible(int row, int col, int value) {
//        boolean[] visited = new boolean[10]; //1~9까지 숫자가 사용됐는지 체크

        for (int i = 0; i < 9; i++) {
            if (arr[row][i] == value) return false; //해당 위치의 행을 전체 탐색, 인자로 넘어온 value가 이미 다른 열에 있다면 false 리턴
            if (arr[i][col] == value) return false; //해당 위치의 열을 전체 탐색, 인자로 넘어온 value가 이미 다른 열에 있다면 false 리턴
        }
//        if(!checkSquare(row, col, value)) return false;

        row = (row / 3) * 3;
        col = (col / 3) * 3;

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (arr[i][j] == value) return false;
            }
        }

//        checkGaro(row, visited);
//        checkSero(col, visited);
//        checkSquare(row, col, visited);

//        for (i = 1; i < visited.length; i++)
//            if (visited[i] != true) ;

        return true;
    }

//    public static boolean[] checkGaro(int row, boolean[] visited) {
//        for (int i = 0; i < 9; i++) {
//            visited[Integer.parseInt(arr[row][i])] = true;
//        }
//        return visited;
//    }
//
//    public static boolean[] checkSero(int col, boolean[] visited) {
//        for (int i = 0; i < 9; i++) {
//            visited[Integer.parseInt(arr[i][col])] = true;
//        }
//
//        return visited;
//    }
//
//    public static boolean checkSquare(int row, int col, int value) {
//        row = (row / 3) * 3;
//        col = (col / 3) * 3;
//
//        for (int i = row; i < row + 3; i++) {
//            for (int j = col; j < col + 3; j++) {
//                if (arr[i][j].equals(value)) return false;
//            }
//        }
//
//        return true;
//    }

    public static void print() throws IOException {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.newLine();
        }
        bw.close();
    }

}