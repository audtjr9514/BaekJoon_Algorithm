import java.util.Scanner;

public class bj_2798 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); // 주어질 카드의 갯수
        int max = scan.nextInt(); // 기준 값
        int[] card = new int[num];

        for (int i = 0; i < num; i++)
            card[i] = scan.nextInt();


        int temp = 0;
        for (int i = 0; i < num - 2; i++)
            for (int j = i + 1; j < num - 1; j++)
                for (int z = j + 1; z < num; z++) {
                    int sum = card[i] + card[j] + card[z];
                    if (sum <= max) {
                        if (temp <= sum)
                            temp = sum;
                    }
                }
        System.out.println(temp);
        scan.close();
    }
}
