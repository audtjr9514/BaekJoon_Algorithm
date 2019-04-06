/*
1. 각 세트당 배열에 1씩 할당한다.
    - 6은 9로 사용할 수 있으므로 6은 0으로 9로 사용한다.
2. count는 세트의 갯수이다
3. 입력받은 숫자를 배열로 사용하여 하나씩 반복을 돌린다.
4. 각 숫자에 해당하는 세트가 0이 되면 count를 1 증가시킨다.
 - 숫자가 6일 경우에는 9로 생각한다.
 */

import java.util.Scanner;

public class bj_1475 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] num = scan.next().toCharArray();

        int[] set = {1, 1, 1, 1, 1, 1, 0, 1, 1, 2};
        // 세트 num {0, 1, 2, 3, 4, 5, 6/, 7, 8, 9}
        //           6을 9로 생각한다.

        int count = 1; //
        for (char n : num) {
            int x = n - '0';
            if (x == 6)
                x = 9;
            if (set[x] == 0) {
                count++;
                for (int i = 0; i < 10; i++) {
                    if (i == 9)
                        set[i]++;
                    else if (i == 6)
                        continue;
                    set[i]++;
                }
                set[x]--;
            } else
                set[x]--;
        }
        System.out.println(count);
        scan.close();
    }
}

