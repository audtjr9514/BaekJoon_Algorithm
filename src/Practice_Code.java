import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Practice_Code {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int inputNum = Integer.parseInt(br.readLine());
        int count = 1;
        int chkNum = 1;
        while (inputNum > chkNum) {
            chkNum += 6 * count;
            // bw.write(String.valueOf(chkNum)+ " ");
            count++;
        }
        bw.write(String.valueOf(count));
        br.close();
        bw.close();
    }
}