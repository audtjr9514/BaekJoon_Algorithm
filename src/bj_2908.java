import java.util.Scanner;

public class bj_2908 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str1 = scan.next().split("");
        int num1 = Integer.parseInt(str1[2]) * 100 + Integer.parseInt(str1[1]) * 10 + Integer.parseInt(str1[0]);
        String[] str2 = scan.next().split("");
        int num2 = Integer.parseInt(str2[2]) * 100 + Integer.parseInt(str2[1]) * 10 + Integer.parseInt(str2[0]);

        if (num1 > num2)
            System.out.println(num1);
        else
            System.out.println(num2);
        scan.close();
    }
}
