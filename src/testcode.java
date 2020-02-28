import java.io.*;

public class testcode {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = Integer.toString(br.read());
        String m = Integer.toString(br.read());

        bw.write(n + " " + m);

        br.close();
        bw.close();
    }
}