import java.util.Scanner;

public class bj_1436 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i = 665;
        String str = "";
        while (num != 0) {
            str = Integer.toString(i);
            if (str.contains("666")) {
                num--;
            }
            i++;
        }
        System.out.println(str);
        scan.close();

    }
}
