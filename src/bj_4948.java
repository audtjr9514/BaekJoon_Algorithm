import java.util.Scanner;
import java.util.ArrayList;

public class bj_4948 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> demicals = new ArrayList<>();
        while (true) {
            int num = scan.nextInt();
            if (num == 0)
                break;
            int judge = 0;
            int count = 0;
            for (int i = num; i < (num * 2); i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0)
                        judge++;
                }
                if (judge == 2)
                    count++;
            }
            demicals.add(count);
        }
        for (int demical : demicals)
            System.out.println(demical);
    }
}
