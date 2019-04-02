/*
분자의 시작 :   1  ||   1  2   ||   3  2  1   ||   1  2  3  4    ||   5   4   3   2   1   ||
분모의 시작 :   1  ||   2  1   ||   1  2  3   ||   4  3  2  1    ||   1   2   3   4   5   ||
--------------------------------------------------------------------------------------------
순서 :          1  ||   2  3   ||   4  5  6   ||   7  8  9  10   ||   11  12  13  14  15  ||
단계 :          1  ||     2    ||      3      ||       4         ||           5           ||

해당 숫자의 단계가 홀수 일때는 분모가 1부터 시작하여 해당숫자가 될때까지 1씩 증가한다
분자는 역수로 진행이 된다.
 */
import java.util.Scanner;

public class bj_1193 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0, count = 1;
        while (sum < num) {
            sum += count;               // sum : 등차수열의 합
            count++;
        }
        count--;                        // count : 단계
        int classes = count;
        int seq = num - (sum - count); // seq : 입력한 숫자의 해당 등차수열에서의 순서

        int i;
        for (i = 1; i < seq; i++)
            classes--;

        if (count % 2 == 0) // 단계가 짝수일때
            System.out.println(i + "/" + classes);
        else
            System.out.println(classes + "/" + i);
    }
}
