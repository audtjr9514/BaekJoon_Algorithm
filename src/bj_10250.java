import java.util.Scanner;

public class bj_10250 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();
        int result[] = new int[testcase];
        for (int i = 0; i < testcase; i++) {
            int height = scan.nextInt();
            int width = scan.nextInt(); // 이건 입력 안받아도 되는거 같음. 입력 조건에 있어서 받음
            int num = scan.nextInt();
            int count_w = 1;
            while (num > height) {
                num -= height;
                count_w++;
            }
            result[i] = num * 100 + count_w;
        }
        for (int n : result)
            System.out.println(n);
        scan.close();
    }
}
