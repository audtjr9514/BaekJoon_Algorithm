import java.util.Scanner;

public class bj_1427 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] num = scan.next().toCharArray();
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < i; j++) {
                if (num[i] - '0' > num[j] - '0') {
                    char temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }

        }
        System.out.print(num);
        scan.close();
    }
}
