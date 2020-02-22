/*
산술평균 : N개의 수들의 합을 N으로 나눈 값
중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
최빈값 : N개의 수들 중 가장 많이 나타나는 값
범위 : N개의 수들 중 최댓값과 최솟값의 차이
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class bj_2108 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();

        int[] numbers = new int[total];
        for (int i = 0; i < total; i++)
            numbers[i] = scan.nextInt();
        Arrays.sort(numbers); // 입력받은 수들을 정렬

        // 산술 평균
        int sum = 0;
        for (int num : numbers)
            sum += num;
        System.out.println(sum / total);

//      // 중앙값
        System.out.println(numbers[total / 2]);


        // 최빈값
        int[] num_chk = new int[8001];
        Arrays.fill(num_chk, 0);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0)
                num_chk[Math.abs(numbers[i])]++;
            else
                num_chk[numbers[i]+4000]++;
        }
        int count = 0;
        int max = 0;
        ArrayList<Integer> many = new ArrayList<>();
        for (int i = 0; i < num_chk.length; i++) {
            if (count <= num_chk[i])
                if (count < num_chk[i]) {
                    count = num_chk[i];
                    many.clear();
                    many.add(i);
                } else {
                    many.pop();
                }
        }
        System.out.println(max-4000);

        // 범위
        System.out.println(numbers[numbers.length - 1] - numbers[0]);

        scan.close();

    }
}