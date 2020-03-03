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
    static ArrayList<Integer> result = new ArrayList<Integer>();

    static void oper(int start){

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
        oper(0);
        Collections.sort(result);

        br.close();
        bw.close();

    }
}
