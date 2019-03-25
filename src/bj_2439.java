import java.util.Scanner;

public class bj_2439 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int i, j, k;
        for(i = 1; i < x+1; i++ ) {
            for (j = 0; j < x-i; j++)
                System.out.print(" ");
            for (k = 0; k < i; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
