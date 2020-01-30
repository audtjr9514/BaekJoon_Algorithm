import java.util.Scanner;

public class bj_1712 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fixed = scan.nextInt();
        int cost = scan.nextInt();
        int sale = scan.nextInt();
        if (sale > cost)
            System.out.println(fixed / (sale - cost) + 1);
        else
            System.out.println(-1);
        scan.close();
    }
}
