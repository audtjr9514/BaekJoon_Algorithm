import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class bj_14888 {
    static int[] numbers; // 초기 수열
    static int[] operation = new int[4]; // 사칙 연산
    static ArrayList<Integer> end_result = new ArrayList<>();

    static void oper(int level, int result) throws IOException {
        if (level == numbers.length - 1) {// 모든 단계를 거치면 리스트에 추가
            end_result.add(result);
            return;
        } else {
            for (int i = 0; i < 4; i++) {
                if (operation[i] > 0) {
                    operation[i]--;
                    int next = chk_result(i, level + 1, result);
                    // next는 현재 레벨의 값과, 그 다음의 레벨 값을 계산해서 넣는 임시 변수
                    oper(level + 1, next);
                    operation[i]++;
                }
            }
        }
    }

    static int chk_result(int i, int level, int result) {
        // 1:+ , 2:-, 3:*, 4:/
        if (i == 0)
            return result + numbers[level];
        else if (i == 1)
            return result - numbers[level];
        else if (i == 2)
            return result * numbers[level];
        else
            return result / numbers[level];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());
        numbers = new int[number]; // 숫자 수열

        // 수열 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = Integer.parseInt(st.nextToken());
        // 사칙연산 개수 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < operation.length; i++)
            operation[i] = Integer.parseInt(st.nextToken());


        int result = numbers[0];// 초기 계산을 위한 시작값
        oper(0, result); //단계는 0에서 시작, 수열의 첫번째 값을 시작으로 넣는다.
        Collections.sort(end_result);

        bw.write(String.valueOf(end_result.get(end_result.size() - 1)) + '\n' + end_result.get(0));

        br.close();
        bw.close();
    }
}
