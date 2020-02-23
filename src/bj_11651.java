import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class MyComparator2 implements Comparator<int[]> {
    @Override
    public int compare(int[] x1, int[] x2) {
        if (x1[1] == x2[1]) {
            return Integer.compare(x1[0], x2[0]);
        }
        return Integer.compare(x1[1], x2[1]);
    }
}

public class bj_11651 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[][] point = new int[num][2];
        for (int i = 0; i < num; i++) {
            point[i][0] = scan.nextInt();
            point[i][1] = scan.nextInt();
        }
        Arrays.sort(point, new MyComparator2());

        for (int a[] : point) {
            for (int n : a) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}