import java.util.Scanner;
import java.util.Arrays;

public class bj_7568 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        int[][] persons = new int[count][2];
        int[] ranks = new int[count];
        for (int i = 0; i < count; i++) {
            persons[i][0] = scan.nextInt();
            persons[i][1] = scan.nextInt();
        }
        Arrays.fill(ranks, 1);

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i != j) {
                    if (persons[i][0] < persons[j][0] && persons[i][1] < persons[j][1])
                        ranks[i]++;
                }
            }
        }
        for (int rank : ranks) {
            System.out.print(rank);
            System.out.print(' ');
        }
        scan.close();
    }
}
