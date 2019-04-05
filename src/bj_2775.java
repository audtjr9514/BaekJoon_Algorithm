/*
2층	    |     1호	    2호	      3호	    4호
인원    |     1         4         10        20
규칙    |     1         1+3       1+3+6     1+3+6+10

1층     |     1호   	2호       3호   	4호
인원    |     1         3         6         10
규칙    |     1         1+2       1+2+3     1+2+3+4

0층     |     1호       2호       3호       4호
인원    |     1	        2         3         4
*/

import java.util.*;

public class bj_2775 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();             // 테스트 케이스
        int[] test = new int[testcase];            // 테스트 케이스마다의 결과 저장 배열

        for (int i = 0; i < testcase; i++) {
            int floor = scan.nextInt();             // 층수 입력
            int house = scan.nextInt();             // 호수 입력
            int[] layer = new int[house];          // 호수 만큼의 배열 생성
            for (int j = 0; j < house; j++)        // 호수 만큼의 배열(0층)을 1로 생성
                layer[j] = j + 1;

            for (int k = 0; k < floor; k++)        // 층수 만큼 반복
                for (int z = 1; z < house; z++)    // 호수 만큼 반복
                    layer[z] += layer[z - 1];      // 전 호수의 인원만큼 더해준다
            test[i] = layer[house - 1];
        }
        for (int result : test)
            System.out.println(result);

        scan.close();
    }
}
