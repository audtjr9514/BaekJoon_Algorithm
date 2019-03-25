import java.util.Scanner;

public class bj_10871 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int x = scan.nextInt();

        int[] all = new int[num];
        for (int i = 0; i < num; i++)
            all[i] = scan.nextInt();
        for (int number : all)
            if(number < x)
                System.out.print(number + " ");
    }
}