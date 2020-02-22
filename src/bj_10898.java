// 카운팅 정렬

import java.io.*;
import java.util.Arrays;

public class bj_10898 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = Integer.parseInt(br.readLine());

        int[] num = new int[total];
        for (int i = 0; i < total; i++)
            num[i] = Integer.parseInt(br.readLine());
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < total; i++)
            if (max < num[i])
                max = num[i];

        int[] count = new int[max + 1];
        Arrays.fill(count, 0);
        for (int n : num)
            count[n]++;

        for (int n : count) {
            if (n != 0)
                for (int i = 0; i < n; i++)
                    bw.write(cnt + "\n");
            cnt++;
        }
        br.close();
        bw.close();
    }
}
