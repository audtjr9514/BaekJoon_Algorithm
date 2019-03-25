import java.util.Scanner;

public class bj_1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        float best = 0;
        float sum = 0;
        int[] all = new int[num];
        for (int i = 0; i < num; i++) {
            all[i] = scan.nextInt();
            if (all[i] > best)
                best = all[i];
        }
        for (int i = 0; i < num; i++)
            sum += ((all[i] / best) * 100);
        System.out.print(sum / num);
    }
}