import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class bj_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            int count = Integer.parseInt(br.readLine());
            HashMap<String, Integer> clothes = new HashMap<>();
            int result = 1;
            for (int j = 0; j < count; j++) {
                st = new StringTokenizer(br.readLine());
                String cloth = st.nextToken();
                String kind = st.nextToken();
                if (clothes.containsKey(kind))
                    clothes.put(kind, clothes.get(kind) + 1);
                else
                    clothes.put(kind, 1);

            }
            for (int c : clothes.values())
                result *= c + 1;
            bw.write(String.valueOf(result - 1));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
