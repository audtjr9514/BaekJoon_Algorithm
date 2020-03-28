import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int big = 0;
        int small = 0;
        while (true) {
            String str = br.readLine();
            if (str.equals("."))
                break;

            char tmp = ' ';

            for (int i = 0; i < str.length(); i++) {
                switch (str.charAt(i)) {
                    case '[':
                        tmp = str.charAt(i);
                        big++;
                        bw.write("big : " + big + " / ");
                        break;
                    case ']':
                        if (big == 0 || tmp == '(')
                            big = -100;
                        big--;
                        bw.write("big : " + big + " / ");
                        break;
                    case '(':
                        tmp = str.charAt(i);
                        small++;
                        bw.write("small : " + small + " / ");
                        break;
                    case ')':
                        if (small == 0 || tmp == '[')
                            small = -100;
                        small--;
                        bw.write("small : " + small + " / ");
                        break;
                }
            }
            if (small == 0 && big == 0)
                bw.write("yes\n");
            else
                bw.write("no\n");
            small = 0;
            big = 0;
        }
        br.close();
        bw.close();
    }
}