import java.util.Scanner;

public class bj_9498 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x >= 90) System.out.println('A');
        else if (x >= 80) System.out.println('B');
        else if (x >= 70) System.out.println('C');
        else if (x >= 60) System.out.println('D');
        else System.out.println('F');
    }
}
