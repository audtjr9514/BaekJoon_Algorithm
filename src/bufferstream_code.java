import java.io.BufferedReader;        // io패키지의 BufferedReader 클래스 import
import java.io.BufferedWriter;        // io패키지의 BufferedWriter 클래스 import
import java.io.IOException;
// 예외처리를 위해 io패키지의 IOException 클래스 import
import java.io.InputStreamReader;    // io패키지의 InputStreamReader 클래스 import
import java.io.OutputStreamWriter;    // io패키지의 InputStreamReader 클래스 import

public class bufferstream_code {
    public static void main(String[] args) throws IOException {
        // 예외처리를 위해 IOException을 throws 해준다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력을 위한 BufferedReader 스트림 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 출력을 위한 BufferedWriter 스트림 생성

        char character = br.readLine().charAt(0);
        // 입력 한줄을 받아와 그 첫번째 문자를 char형으로 변환
        int int_number = Integer.parseInt(br.readLine());
        // 입력 한줄을 받아 int형으로 변환
        float float_number = Float.parseFloat(br.readLine());
        // 입력 한줄을 받아 int형으로 변환
        double double_number = Double.parseDouble(br.readLine());
        // 입력 한줄을 받아 int형으로 변환
        String string = br.readLine();
        // 입력 자체가 String이므로 변환할 필요가 없다.

        bw.write(character);
        bw.newLine();
        bw.write(String.valueOf(int_number));
        bw.newLine();
        bw.write(String.valueOf(float_number));
        bw.newLine();
        bw.write(String.valueOf(double_number));
        bw.newLine();
        // 위의 세 문장에서 String.valueOf()를 사용하지 않을시 오류 발생
        // int 형의 경우 오류는 나지 않으나 아스키 코드로 출력
        bw.write(string);
        bw.newLine();
        // 개행하는 법 1 : bw.write(str+ '\n');
        //           2 : bw.newLine();

        br.close(); // 입력 스트림 닫기
        bw.close(); // 출력 스트림 닫기
    }
}