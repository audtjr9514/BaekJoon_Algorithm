import java.util.Scanner;

public class bj_2884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt() - 45;

        if (minute < 0) {
            if (hour == 0) {
                hour = 23;
                minute += 60;
            } else {
                hour--;
                minute += 60;
            }
        }
        System.out.print(hour + " " + minute);
    }
}
