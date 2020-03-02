/*
N-Queen : 크기가 N × N인 체스판에 N개의 퀸이 서로 공격 받지 않게 놓는 경우의 수
퀸의 공격범위 : 상하좌우 대각선으로 모든 칸수 공격 가능
ex) 4 × 4 체스판에서의 놓을수 있는 경우
  1 2 3 4
1 Q x x x
2 x x o o
3 x o x o
4 x o o x

배열은 N개짜리 1차원 배열이 필요
=> N개의 퀸은 서로 열이 겹치지 않기 때문이다.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_9663 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int[] chess;
    static int total = 0;

    static void check(int level) { // level은 체스판의 행
        if (level == N) // 만약 0부터 시작한 행이 N까지 도달한다면 경우의 수 성공
            total++;
        else {
            for (int i = 0; i < N; i++) {
                chess[level] = i; // 0행의 i열에 퀸을 놓는다.
                if (isPossible(level)) // isPossible 함수를 호출해서 퀸을 놓을수 있는지 체크
                    check(level + 1); // 만약 가능하다면 다음 행을 체크
            }
        }

    }

    static boolean isPossible(int level) { // level 행의 퀸이 전 행들에 놓여있는 퀸들에게 위협을 받는가 체크
        for (int i = 0; i < level; i++)
            if (chess[i] == chess[level] || (Math.abs(level - i) == Math.abs(chess[level] - chess[i])))
                // i 행의 퀸(level 전의 행들)이 level 행의 퀸과 일직선에 있는 경우
                // 또는
                // i 행의 퀸(level 전의 행들)이 level 행의 퀸과 대각선상에 놓여져있는 경우
                return false;
        return true; // 만약 level 전 행들의 퀸이 모두 위협이 되지 않는다면 true를 반환해 다음 행(level+1)을 체크
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        chess = new int[N];

        check(0);
        bw.write(String.valueOf(total));

        br.close();
        bw.close();
    }
}
