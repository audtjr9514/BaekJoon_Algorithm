import java.io.*;
import java.util.StringTokenizer;

public class bj_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner를 대신하는 BufferedReader
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// System.out.println()을 대신함

        // String s = bf.readLine(); //String
        int i = Integer.parseInt(br.readLine()); //Int

        for (int j = 0; j < i; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // StringTokenizer인자값에 입력 문자열 넣음
            int a = Integer.parseInt(st.nextToken()); //첫번째 호출
            int b = Integer.parseInt(st.nextToken()); //두번째 호출

            bw.write(a + b + "\n");
        }
        bw.flush();//남아있는 데이터를 모두 출력시킴
        bw.close();//스트림을 닫음
    }
}