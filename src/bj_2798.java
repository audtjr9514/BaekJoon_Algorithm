import java.util.Scanner;
import java.lang.Math;

public class bj_2798 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int max = scan.nextInt();
        int[] card = new int[num];
        int[] last = new int[3];

        for (int i = 0; i < num; i++)
            card[i] = scan.nextInt();

        int sum = 0;
        outline:
        for (int i = 0; i < num - 2; i++)
            for (int j = i + 1; j < num - 1; j++)
                for (int z = j + 1; z < num; z++) {
                    sum += (card[i] + card[j] + card[z]);
                    if (sum <= max) {
                        last[0] = card[i];
                        last[1] = card[j];
                        last[2] = card[z];
                    }
                    sum = 0;
                }
        System.out.print(last[0] + last[1] + last[2]);
    }
}
