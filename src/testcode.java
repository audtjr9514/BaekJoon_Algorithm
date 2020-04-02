//import java.util.Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class testcode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Array1[] = new int[100];
        int Array2[] = new int[100];
//첫번째 집합 입력 후 출력
        System.out.println("첫번째 집합을 입력하세요. 입력을 마쳤으면 양이 아닌 정수를 입력하세요 :");
        int Array1_chk=0, Array2_chk=0;

        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = sc.nextInt();
            if (Array1[i] < 0) {
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
                System.out.println("종료");
                j--;
                Array2_chk = j;
                break;
            }
            System.out.print(Array2[j] + " ");
        }
//두 집합 비교하기
        int dup =0;
        if(Array1_chk == Array2_chk){
            for(int i =0; i<Array1_chk;i++){
                if( Array1[i] == Array2[i])
                    dup++;
            }
        }
        else
            System.out.println("두 집합은 다릅니다.");

        if(dup == Array1_chk)
            System.out.println("두 집합은 같습니다.");

        System.out.println(dup);
        sc.close();
    }
}