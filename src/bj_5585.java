import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = 1000 - Integer.parseInt(br.readLine());
        int count = 0;
        while (num > 0) {
            if (num / 500 > 0) {
                count += num / 500;
                num = num % 500;
            } else if (num / 100 > 0) {
                count += num / 100;
                num = num % 100;
            } else if (num / 50 > 0) {
                count += num / 50;
                num = num % 50;
            } else if (num / 10 > 0) {
                count += num / 10;
                num = num % 10;
            } else if (num / 5 > 0) {
                count += num / 5;
                num = num % 5;
            } else {
                count += num / 1;
                num = num % 1;
            }
        }
        bw.write(String.valueOf(count));

        br.close();
        bw.close();
    }
}
