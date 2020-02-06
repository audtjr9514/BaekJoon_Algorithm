import java.util.Scanner;

public class bj_9020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();

        // 에라토스테네스의 체를 이용해 미리 소수 값을 구해준다.
        boolean[] decimal = new boolean[5082];
        decimal[0] = decimal[1] = false;
        for (int i = 2; i <= 5081; i++)
            decimal[i] = true;

        for (int i = 2; i * i <= 5081; i++) {
            for (int j = i * i; j <= 5081; j += i)
                decimal[j] = false;
        }

        for (int i = 0; i < testcase; i++) {
            int num = scan.nextInt();
            int x = num / 2, y = num / 2;
            while (true) {

                if (decimal[x] == true && decimal[y] == true)
                    break;
                x--;
                y++;
            }
            System.out.println(x + " " + y);
        }
        scan.close();
    }
}
