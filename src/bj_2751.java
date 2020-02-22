import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class bj_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());

        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < count; i++)
            num.add(Integer.parseInt(br.readLine()));

        Collections.sort(num);
        for (int n : num)
            bw.write(n +"\n");
        br.close();
        bw.close();

    }
}