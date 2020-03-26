import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_5565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result =Integer.parseInt(br.readLine());
        for(int i =0; i<9;i++){
            result -= Integer.parseInt(br.readLine());
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}