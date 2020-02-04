import java.util.Scanner;
import java.lang.Math;

public class bj_3053 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();
        System.out.println(String.format("%.6f", (double) (radius * radius * Math.PI)));
        System.out.println(String.format("%.6f", (double) (radius * radius * 2)));
        scan.close();
    }
}
