import java.util.Scanner;

public class bj_2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sugar = scan.nextInt();
        if (sugar % 5 == 0) {
            System.out.println(sugar / 5);
            return;
        } else {
            int five = sugar / 5;
            for (int i = five; i > 0; i--) {
                int temp = sugar - (i * 5);
                if (temp % 3 == 0) {
                    System.out.println(i + (temp / 3));
                    return;
                }
            }
        }
        if (sugar % 3 == 0)
            System.out.println(sugar / 3);
        else
            System.out.println(-1);
        scan.close();
    }
}