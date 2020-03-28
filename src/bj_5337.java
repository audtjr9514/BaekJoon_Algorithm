import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_5337 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(".  .   .");
        bw.newLine();
        bw.write("|  | _ | _. _ ._ _  _");
        bw.newLine();
        bw.write("|/\\|(/.|(_.(_)[ | )(/.");

        br.close();
        bw.close();

    }
}
