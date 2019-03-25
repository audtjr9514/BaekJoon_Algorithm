import java.util.Scanner;

public class bj_2440 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int i, j;
        for(i = 0; i < x; i++ ) {
            for (j = 0; j < x-i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
