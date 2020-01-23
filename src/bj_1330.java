import java.util.Scanner;

public class bj_1330 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        if(x > y)
            System.out.println(">");
        else if(x == y)
            System.out.println("==");
        else
            System.out.println("<");
    }
}