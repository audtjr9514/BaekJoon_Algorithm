import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Doc {
    int index;
    int priority;

    public Doc(int priority, int index) {
        this.priority = priority;
        this.index = index;
    }
}

public class bj_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());
        Queue<Doc> printQ = new LinkedList();
        int numbers;
        int chk;
        for (int i = 0; i < testcase; i++) {
            st = new StringTokenizer(br.readLine());
            numbers = Integer.parseInt(st.nextToken());
            chk = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < numbers; j++) {
                printQ.add(new Doc(Integer.parseInt(st.nextToken()), j));
            }
            int index = 1;
            while (!printQ.isEmpty()) {
                Doc currentDoc = printQ.poll(); // 가장 앞에있는 문서를 꺼냄
                boolean check = true; // 문서의 우선순위를 확인하는 변수
                Iterator it = printQ.iterator();
                while (it.hasNext()) {
                    Doc value = (Doc) it.next();
                    if (currentDoc.priority < value.priority) { // 현재 문서의 우선순위보다 우선순위가 큰 문서가 있다면,
                        check = false;
                        break; // 이터레이터 탐색을 종료함
                    }
                }

                if (check == false) { // 현재문서보다 높은 우선순위를 가진 문서를 발견했다면
                    printQ.add(currentDoc); // 현재 문서를 맨 뒤로 보냄
                } else {
                    if (currentDoc.index == chk) { // 현재 문서의 번호와 찾으려는 문서의 번호가 동일하다면
                        bw.write(String.valueOf(index));
                        bw.newLine();
                    } else {
                        index++;
                    }
                }
            }
        }
        br.close();
        bw.close();
    }
}

