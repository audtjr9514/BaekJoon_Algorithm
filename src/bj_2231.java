import java.util.Scanner;

public class bj_2231 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp = 0;
        for (int i = 1; i < num; i++) {
            int sum = i;
            for (int j = 0; j < Integer.toString(i).length(); j++) {
                sum += (Integer.toString(i).charAt(j) - '0');
            }

            if (sum == num) {
                temp = i;
                break;
            }
        }
        System.out.println(temp);

        scan.close();
    }
}
