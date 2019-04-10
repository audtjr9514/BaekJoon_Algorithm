/*
1. 크로아티아 알파벳을 미리 배열로 설정해둔다.
2. 문자열을 입력 받고
3. 크로아티아 알파벳을 각 요소마다 반복을 돌려서
4. 입력 받은 문자열을 해당 크로아티아 알파벳마다 X로 치환한다.
 */

import java.util.Scanner;

public class bj_2941 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] croaltia_alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = scan.next();
        for (String alpha : croaltia_alpha)
            str = str.replace(alpha, "X");
        System.out.println(str.length());
        scan.close();
    }
}
