import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;

public class bj_18870 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine()); // 배열의 크기
        int nums[] = new int[size]; // 입력받을 기존의 배열

        TreeSet<Integer> tree = new TreeSet<>();
        Map<Integer, Integer> result = new HashMap();

        // 배열 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            tree.add(nums[i]);
        }
        // 트리를 리스트[배열]로 변환
        Object[] list = tree.toArray();

        // 리스트를 해쉬맵에 입력
        for (int i = 0; i < list.length; i++)
            result.put((int) list[i], i);

        // 해쉬맵에서 기존의 배열에 따라 값을 갖고 나온다.
        for (int i = 0; i < size; i++)
            bw.write(result.get(nums[i]) + " ");
        br.close();
        bw.close();
    }
}
