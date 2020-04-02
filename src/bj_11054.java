import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        int[] counts_left = new int[N];
        int[] counts_right = new int[N];
        int max = 0;


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            counts_left[i] = 1;
            for (int j = 0; j < i; j++) {
                if (numbers[i] > numbers[j] && counts_left[i] <= counts_left[j]) {
                    counts_left[i] = counts_left[j] + 1;
                } else if (numbers[i] == numbers[j])
                    counts_left[i] = counts_left[j];
            }
        }

        for (int i = N-1; i >=0; i--) {
            counts_right[i] = 1;
            for (int j = N-1; j >= i; j--) {
                if (numbers[i] > numbers[j] && counts_right[i] <= counts_right[j]) {
                    counts_right[i] = counts_right[j] + 1;
                } else if (numbers[i] == numbers[j])
                    counts_right[i] = counts_right[j];
            }
        }
        for(int i =0; i< N ; i++){
            counts_left[i] += counts_right[i];
            if(counts_left[i] > max)
                max = counts_left[i];
        }

//        for (int c1 : counts_left)
//            bw.write(" " + c1);
//        bw.newLine();
//        for (int c2 : counts_right)
//            bw.write(" " + c2);
//        bw.newLine();
        bw.write(String.valueOf(max-1));

        br.close();
        bw.close();
    }
}
