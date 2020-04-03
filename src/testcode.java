import java.util.Scanner;

public class testcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Array1[] = new int[100];
        int Array2[] = new int[100];
        int Array1_chk = 0;
        int Array2_chk = 0;
        //첫번째 집합 입력 후 출력
        System.out.println("첫번째 집합을 입력하세요. 입력을 마쳤으면 양이 아닌 정수를 입력하세요 :");

        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = sc.nextInt();
            if (Array1[i] < 0) {
                Array1[i] = 0;
                System.out.println("종료");
                i--;
                Array1_chk = i;
                break;
            }
            System.out.print(Array1[i] + " ");
        }
        //두번째 집합 입력 후 출력
        System.out.println("두번째 집합을 입력하세요. 입력을 마쳤으면 양이 아닌 정수를 입력하세요 :");

        for (int j = 0; j < Array2.length; j++) {
            Array2[j] = sc.nextInt();
            if (Array2[j] < 0) {
                Array2[j] = 0;
                System.out.println("종료");
                j--;
                Array2_chk = j;
                break;
            }
            System.out.print(Array2[j] + " ");
        }

        //첫번재 집합 정렬
        for (int i = 0; i < Array1.length - 1; i++) {
            for (int j = (i + 1); j < Array1.length; j++) {
                if (Array1[i] > Array1[j]) {
                    int temp = Array1[i];
                    Array1[i] = Array1[j];
                    Array1[j] = temp;
                }
            }
        }
        //두번쨰 집합 정렬
        for (int i = 0; i < Array2.length - 1; i++) {
            for (int j = (i + 1); j < Array2.length; j++) {
                if (Array2[i] > Array2[j]) {
                    int temp = Array2[i];
                    Array2[i] = Array2[j];
                    Array2[j] = temp;
                }
            }
        }

        //두 집합 비교하기
        if (Array1_chk == Array2_chk) {
            for (int i = 0; i <= Array1_chk; i++) {
                if (Array1[i] != Array2[i]) {
                    System.out.println("두 집합은 다릅니다.");
                    break;
                }
                if ((i == Array1_chk) && (Array1[i] == Array2[i]))
                    System.out.println("두 집합은 같습니다.");
            }
        } else
            System.out.println("두 집합은 다릅니다.");

        sc.close();
    }
}