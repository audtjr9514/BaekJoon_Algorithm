import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer; // util 패키지의 StringTokenizer 클래스 import

public class stringtokenizer_code {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st; 				    // StringTokenizer 선언

        int[] numbers = new int[10];

        st = new StringTokenizer(br.readLine());
        // 입력을 받아와 StringTokenizer 상태로 입력받아옴
        for (int i = 0; i < 10; i++)
            numbers[i] = Integer.parseInt(st.nextToken());
        // 각 토큰을 int형으로 변환 하여 배열에 초기화

        for (int number : numbers)
            bw.write(String.valueOf(number) + ' ');

        br.close();
        bw.close();
    }
}