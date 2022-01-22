package kakao_2022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

class Data {
    int time;
    int total;
    boolean chk;

    public Data(int time, boolean chk) {
        this.time = time;
        total = 0;
        this.chk = chk;
    }
}

public class test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        int[] result = solution(fees, records);
        bw.write("[ ");
        for (int i : result)
            bw.write(i + ", ");
        bw.write("]");
        br.close();
        bw.close();
    }

    static public int[] solution(int[] fees, String[] records) {
        TreeMap<Integer, Data> results = new TreeMap<Integer, Data>();
        for (int i = 0; i < records.length; i++) {
            int time = Integer.parseInt(records[i].split(" ")[0].split(":")[0]) * 60 + Integer.parseInt(records[i].split(" ")[0].split(":")[1]); // 시각
            int num = Integer.parseInt(records[i].split(" ")[1]); // 번호
            String chk = records[i].split(" ")[2]; // 입,출차

            if (results.containsKey(num)) { // 만약 이미 입출차 기록이 있다면
                if (chk.equals("OUT")) { // 출차라면
                    Data newData = new Data(time, false);
                    newData.time = -1;
                    newData.total = results.get(num).total + time - results.get(num).time;

                    results.replace(num, newData);
                } else { // 입차라면
                    Data newData = new Data(time, true);
                    newData.total = results.get(num).total;
                    results.replace(num, newData);
                }
            } else { // 만약 이미 입출차 기록이 없다면
                Data newData = new Data(time, true);
                results.put(num, newData);
            }
        }
        int[] answer = new int[results.size()];
        int seq = 0;
        for (Integer i : results.keySet()) {
            if (results.get(i).chk == true) {
                Data newData = new Data(1439, false);
                newData.total = results.get(i).total + newData.time - results.get(i).time;
                results.replace(i, newData);
            }
            if (results.get(i).total < fees[0])
                answer[seq] = fees[1];
            else
                answer[seq++] = fees[1] + (int) Math.ceil((double) (results.get(i).total - fees[0]) / fees[2]) * fees[3];
        }
        return answer;
    }
}
