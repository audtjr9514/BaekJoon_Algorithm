import java.util.Scanner;

public class bj_3009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] numbers = new int[4][2];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 2; j++)
                numbers[i][j] = scan.nextInt();
        // x좌표
        if (numbers[0][0] != numbers[1][0]) {
            if (numbers[0][0] == numbers[2][0])
                numbers[3][0] = numbers[1][0];
            else
                numbers[3][0] = numbers[0][0];
        } else
            numbers[3][0] = numbers[2][0];

        // y좌표
        if (numbers[0][1] != numbers[1][1]) {
            if (numbers[0][1] == numbers[2][1])
                numbers[3][1] = numbers[1][1];
            else
                numbers[3][1] = numbers[0][1];
        } else
            numbers[3][1] = numbers[2][1];

        System.out.println(numbers[3][0] + " " + numbers[3][1]);
        ]

        scan.close();

    }
}
