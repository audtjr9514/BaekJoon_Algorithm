import java.util.Scanner;

public class bj_2739 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        for(int i = 1; i < 10; i++ )
            System.out.println(x + " * " + i + " = " + i*x);
    }
}