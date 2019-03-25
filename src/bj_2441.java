import java.util.Scanner;

public class bj_2441 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int i, j, k;
        for(i = 0; i < x; i++ ) {
            for (j=0; j < i; j++)
                System.out.print(" ");
            for (k = 0; k < x-i; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
