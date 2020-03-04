import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_14889 {
    static int[][] peoples;
    static boolean[] start_link;
    static int min = 250000;

    // 팀의 조합 구하는 것을 백트래킹으로 구현
    // 만약 단계가 N / 2에 도달하면 true반, false반으로 나눠짐
    // 도달 시에 각 팀의 능력치 구하기
    // 15650번 조합 참고
    static void division(int start, int level) {
        if (level == peoples.length / 2) {
            min = diff();
            return;
        }
        for (int i = start; i < peoples.length; i++) {
            if (!start_link[i]) {
                start_link[i] = true;
                division(i + 1, level -1);
                start_link[i] = false;
            }
        }
    }

    static int diff() {
        int diff_true = 0; // true 팀의 능력치 합
        int diff_false = 0; // false 팀의 능력치 합

        // true팀과 false팀의 능력치 합 구하기
        for (int i = 0; i < peoples.length; i++) {
            for (int j = 0; j < peoples.length; j++) {
                // true팀
                if (start_link[i] && start_link[j])
                    diff_true += peoples[i][j];
                    // false팀
                else if (start_link[i] == false && start_link[j] == false)
                    diff_false += peoples[i][j];
            }
        }
        //각 팀의 능력치 차이의 절댓값
        int total_diff = ((diff_true - diff_false) > 0 ? (diff_true - diff_false) : -(diff_true - diff_false));

        // 능력치 차이 최솟값 반환
        if (min > total_diff)
            return total_diff;
        else
            return min;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        peoples = new int[N][N]; // 초기에 입력해주는 N명 사람의 능력 값
        start_link = new boolean[N]; // 팀을 구성할때 체크할 용도

        // 초기 행렬 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                peoples[i][j] = Integer.parseInt(st.nextToken());
        }
        division(0, N); // 백트래킹
        bw.write(String.valueOf(min));

        br.close();
        bw.close();
    }
}
