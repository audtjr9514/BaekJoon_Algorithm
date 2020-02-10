import java.util.*;

public class bj_2447 {
    public static char[][] stars;

    public static void stars(int x, int y, int n) {
        if (n == 1) {
            stars[x][y] = '*';
            return;
        }
        int m = n / 3;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                stars(x + m * i, y + m * j, m);
            }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        stars = new char[num][num];

        for (int i = 0; i < num; i++)
            Arrays.fill(stars[i], ' ');

        stars(0, 0, num);

        for (int i = 0; i < num; i++)
            System.out.println(stars[i]);
        scan.close();
    }
}



