import java.util.Scanner;

public class bj_2839 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        if((x%5)%3 != 0) {
            System.out.println(-1);
        }
        else if (x%5 != 0) {
            System.out.println((x/5)+(x%5)/3);
        }
        else {
            System.out.println((x/5));
        }
    }
}
