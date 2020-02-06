import java.util.Scanner;

public class bj_11729 {
    public static int count = 0;
    public static StringBuilder move = new StringBuilder();

    public static void hanoi(int num, int from, int by, int to) {
        if (num == 1) {
            count++;
            move.append(from + " " + to + "\n");
        } else {
            count++;
            hanoi(num - 1, from, to, by);
            move.append(from + " " + to + "\n");
            hanoi(num - 1, by, from, to);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        hanoi(num, 1, 2, 3);
        System.out.println(count);
        System.out.print(move);
        scan.close();
    }
}
