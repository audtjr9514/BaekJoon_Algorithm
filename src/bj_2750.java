// 버블 정렬로 구현했습니다.

import java.util.Scanner;

public class bj_2750 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();
        int[] number = new int[testcase];
        for (int i = 0; i < testcase; i++) {
            number[i] = scan.nextInt();
            for (int j = 0; j < i; j++) {
                if (number[i] < number[j]) {
                    int temp = number[j];
                    number[j] = number[i];
                    number[i] = temp;
                }
            }
        }
        for (int n : number)
            System.out.println(n);
        scan.close();
    }
}
