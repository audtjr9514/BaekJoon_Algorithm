import java.util.Scanner;
import java.lang.Math;

public class bj_4948 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int num = scan.nextInt();
            if (num == 0)
                break;

            boolean[] decimal = new boolean[num * 2 + 1];
            decimal[0] = decimal[1] = false;
            for (int i = 2; i <= num * 2; i++)
                decimal[i] = true;

            for (int i = 2; i * i <= num * 2; i++) {
                for (int j = i * i; j <= num * 2; j += i)
                    decimal[j] = false;
            }

            int count = 0;
            for (int z = num + 1; z <= num * 2; z++)
                if (decimal[z] == true)
                    count++;
            System.out.println(count);
        }
        scan.close();
    }
}
