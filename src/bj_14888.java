import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class bj_14888 {
    static int[] numbers;
    static int[] operation = new int[4]; // 사칙 연산
    static ArrayList<Integer> end_result = new ArrayList<Integer>();

    static void oper(int level, int result) {
        if (level == numbers.length - 1) {
            end_result.add(result);
            return;
        } else {
            for (int i = 0; i < 4; i++) {
                if (operation[i] > 0) {
                    operation[i]--;
                    result = check(i, level);
                    oper(level + 1, result);
                    operation[i]++;
                }
            }
        }

    }

    static int check(int i, int level) {
        switch (i) {
            case 0:
                return numbers[level] + numbers[level + 1];
            case 1:
                return numbers[level] - numbers[level + 1];
            case 2:
                return numbers[level] * numbers[level + 1];
            case 3:
                return numbers[level] / numbers[level + 1];
        }
        return 0;
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

        int result = 0;
        oper(0, result);
        Collections.sort(end_result);

        for (int x : end_result)
            bw.write(String.valueOf(x) + ' ');

        bw.newLine();
        bw.write(String.valueOf(end_result.get(end_result.size() - 1)) + '\n' + String.valueOf(end_result.get(0)));

        br.close();
        bw.close();

    }
}
