import java.util.Arrays;
import java.util.Scanner;

public class testcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Array1[] = new int[100];

        System.out.println("첫번째 집합을 입력하세요. 입력을 마쳤으면 양이 아닌 정수를 입력하세요 :");

        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = sc.nextInt();
            if (Array1[i] < 0) {
                System.out.println("종료");
                i--;
                break;
            }
            System.out.println(Array1[i]);
        }
        sc.close();
    }
}