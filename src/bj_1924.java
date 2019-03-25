import java.util.Scanner;

public class bj_1924 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int month = scan.nextInt();
        int day = scan.nextInt();

        int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] Weekday = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        for(int i = 0;i<month-1;i++)
            day += months[i];
        System.out.println(Weekday[day % 7]);
    }
}
