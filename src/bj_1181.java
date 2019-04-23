/*
해시를 사용해 중복 입력 제거

 ! ArrayList를 더 공부해볼 필요가 있음.
 */

import java.util.*;

public class bj_1181 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> strs_input = new HashSet<String>();
        int testcase = scan.nextInt();
        for (int i = 0; i < testcase; i++)
            strs_input.add(scan.next());

        ArrayList<String> strs = new ArrayList<String>(strs_input);
        Collections.sort(strs, new Comparator<String>() {
            public int compare(String v1, String v2) {
                if (v1.length() > v2.length())
                    return 1;
                else if (v1.length() < v2.length())
                    return -1;
                else
                    return v1.compareTo(v2);
            }
        });

        for (String str : strs)
            System.out.println(str);
        scan.close();
    }
}

