import java.util.Scanner;

public class bj_1110 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(), temp = num, cnt = 0;
        while (true) {
            int a1 = (temp % 10) * 10;
            int a2 = (temp / 10 + temp % 10) % 10;
            temp = a1 + a2;
            cnt++;
            if (num == temp)
                break;
        }
        System.out.println(cnt);
    }
}