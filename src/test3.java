import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "abcxyasdfasdfxyabc";
        bw.write(s);

        br.close();
        bw.close();
    }

    public static String[] solution(String s) {
        String[] answer;
        int chk = s.length() - 1;
        String chkStr = s.charAt(chk) + "";
        while (true) {
            if (s.contains(s.charAt(chk) + "") == false) {
                answer = s.split(" ");
                break;
            }
            while (s.indexOf(chkStr) != -1) {
                chkStr = s.indexOf(--chk) + chkStr;
            }

        }


        return answer;
    }
}
