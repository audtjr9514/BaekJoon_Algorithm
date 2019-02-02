import java.util.Scanner;

public class bj_10430 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        System.out.println((x+y)%z);
        System.out.println((x%z+y%z)%z);
        System.out.println((x*y)%z);
        System.out.println((x%z*y%z)%z);
    }
}
