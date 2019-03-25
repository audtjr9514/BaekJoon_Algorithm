import java.util.Scanner;

public class bj_10817 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();//1
        int y = scan.nextInt();//2
        int z = scan.nextInt();//3
        if ((x >= y && z <= y) || (z >= y && y >= x))
            System.out.println(y);
        else if ((x >= z && z >= y) || (y >= z && z >= x))
            System.out.println(z);
        else
            System.out.println(x);
    }
}