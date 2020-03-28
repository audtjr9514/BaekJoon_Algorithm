import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] stack = new char[100];
        int top = -1;
        while (true) {
            String str = br.readLine();
            if (str.equals("."))
                break;
            loop:
            for (int i = 0; i < str.length(); i++) {
                switch (str.charAt(i)) {
                    case '[':
                        top++;
                        stack[top] = '[';
                        break;
                    case ']':
                        if (top == -1 || stack[top] == '(') {
                            top++;
                            break loop;
                        } else
                            top--;
                        break;
                    case '(':
                        top++;
                        stack[top] = '(';
                        break;
                    case ')':
                        if (top == -1 || stack[top] == '[') {
                            top++;
                            break loop;
                        } else
                            top--;
                        break;
                }
            }
            if (top == -1)
                bw.write("yes\n");
            else
                bw.write("no\n");
            top = -1;
        }
        br.close();
        bw.close();
    }
}