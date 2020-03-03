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
        }
        for (int i = 0; i < 4; i++) {
            if (operation[i] > 0) {
                operation[i]--;
                result = check(i,result);
                oper(level + 1, result);
            }
        }

    }

    static int check(int i, int result) {
        switch (i) {
            case 0:
                return numbers[i] + numbers[i + 1];
            case 1:
                return numbers[i] - numbers[i + 1];
            case 2:
                return numbers[i] * numbers[i + 1];
            case 3:
                return numbers[i] / numbers[i + 1];
        }
        return 0;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = br.read();
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
        bw.write(end_result.get(0) + '\n' + end_result.get(number - 1));

        br.close();
        bw.close();

    }
}
