import java.util.Scanner;

public class bj_2869 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int up = scan.nextInt();
        int down = scan.nextInt();
        int height = scan.nextInt();
        int day = height / (up - down);
        if (height - day * (up - down) == 0)
            System.out.println(day-1);
        else
            System.out.println(day);
    }
}
