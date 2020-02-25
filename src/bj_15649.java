import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_15649 {
    public static void sequence(int n, int m) throws IOException {
        if(m ==1)
            for(int i=0; i<n;i++)
                bw.write(String.valueOf(i)+' ');

    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = br.read();
        int M = br.read();
        sequence(N, M);

        br.close();
        bw.close();

    }
}
