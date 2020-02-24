import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Comparator;
import java.util.Arrays;

class MyComparator3 implements Comparator<String[]> {
    @Override
    public int compare(String[] age1, String[] age2) {
        return Integer.compare(Integer.parseInt(age1[0]), Integer.parseInt(age2[0]));
    }
}

public class bj_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        String[][] members = new String[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            members[i][0] = st.nextToken();
            members[i][1] = st.nextToken();
        }
        Arrays.sort(members, new MyComparator3());
        for (String member[] : members) {
            for (String mem : member)
                bw.write(mem + " ");
            bw.write('\n');
        }

        br.close();
        bw.close();
    }
}
