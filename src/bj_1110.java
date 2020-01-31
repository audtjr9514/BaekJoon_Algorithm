import java.util.Scanner;

public class bj_1110 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(), temp = num, cnt = 0;
        while (true) {
            int a1 = (temp % 10) * 10; // 주어진 수의 일의자리를 십의자리로
            int a2 = (temp / 10 + temp % 10) % 10; // 주어진 수의 십의 자리와 일의 자리를 더해서 만든 수의 일의 자리를 십의 자리로
            temp = a1 + a2;
            cnt++;
            if (num == temp)
                break;
        }
        System.out.println(cnt);
    }
}

/*
- nsap19 코드 수정
- newint가 0이면 예외 발생

import java.util.Scanner;

public class Baekjoon1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cycle = 0;
        int input = sc.nextInt();
        int newint = 0; //이게 문제
        int first = input;

        while (newint != first) { //newint를 0으로 초기화 했기 때문에 입력받은 값이 0이면 아예 while문이 돌지 않아 cycle이 1이 아닌 0으로 나옴
            newint = input;
            int one = newint % 10;
            int ten = newint / 10;
            int sum = ten + one;
            newint = (one * 10) + (sum % 10);
            cycle++;

            input = newint;

        }
        System.out.println(cycle);

    }
}
}*/
