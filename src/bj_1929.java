/*
에라토스테네스의 체 :
2부터 시작해 자연수를 차례로 쓴 다음,
2 이외의 2의 배수,
3 이외의 3의 배수,
5 이외의 5의 배수의 수를
순서대로 지워나가 끝에 남는 소수가 소수이다.
 */

import java.util.Scanner;

public class bj_1929 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();

        boolean[] decimal = new boolean[end + 1];
        decimal[0] = decimal[1] = false;
        for (int i = 2; i <= end; i++)
            decimal[i] = true;

        for (int i = 2; i * i <= end; i++) {
            for (int j = i * i; j <= end; j += i)
                decimal[j] = false;
        }

        for (int z = start; z <= end; z++)
            if (decimal[z] == true)
                System.out.println(z);
        scan.close();
    }
}
