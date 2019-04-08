/*
1. 테스트 케이스 만큼 단어를 입력받아 char형 배열로 만든다.
2. 알파벳은 26개이므로 전에 나왔던 알파벳인지 체크하기 위해 26개의 배열을 만든다.
3. 단어의 글자수 만큼 반복을 하되 2번째 글자부터 돌린다.
 - 만약 앞에 있던 글자와 현재 글자가 같다면 한번더 검사를 해야한다.
 - 현재 글자의 알파벳 배열이 미리 1로 설정되어있다면 카운트를 올리고 반복을 중지하고 다음 단어로 넘어간다.
 - 근데 만약 해당 글자가 나오지 않았던 글자라면, 알파벳 배열의 해당 글자를 1로 설정하고 다음 글자를 검사한다.
 => 만약 전에 글자와 같다면 바로 다음 글자를 검사한다.
 */

import java.util.Scanner;

public class bj_1316 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();
        int count = 0;
        for (int i = 0; i < testcase; i++) {
            char[] words = scan.next().toCharArray();
            int[] alpha = new int[26];
            for (int j = 1; j < words.length; j++) {
                if (words[j] != words[j - 1]) {         // 만약 전에 나왔던 글자가 지금 글자와 다르다면
                    if (alpha[words[j] - 'a'] == 1) {   // 해당하는 글자가 이미 1로 알파벳 배열이 1로 설정되어있다면
                        count++;                        // 그룹단어가 아니기때문에 카운트를 올리고 반복을 그만둔다.
                        break;
                    }
                    alpha[words[j - 1] - 'a'] = 1;      // 해당하는 글자가 처음 나온거라면 알파벳 배열을 1로 설정한다.
                }
            }
        }
        System.out.println(testcase - count);
        scan.close();
    }
}
