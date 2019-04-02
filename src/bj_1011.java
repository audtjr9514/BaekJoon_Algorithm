import java.util.Scanner;

public class bj_1011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] testcase = new int[scan.nextInt()];

        for (int i = 0; i < testcase.length; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt() - 1;
            int num = 0, move = 1;
            while (true) {
                num += move;
                move++;
                if (x + num >= y)
                    break;
            }
            testcase[i] = move;
        }
        for(int cases : testcase)
            System.out.println(cases);

    }
}
