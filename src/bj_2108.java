/*
산술평균 : N개의 수들의 합을 N으로 나눈 값
중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
최빈값 : N개의 수들 중 가장 많이 나타나는 값
범위 : N개의 수들 중 최댓값과 최솟값의 차이
 */

import java.util.Scanner;

public class bj_2108 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[scan.nextInt()];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scan.nextInt();
        // 산술 평균
        int sum = 0;
        for (int num : numbers)
            sum += num;
        System.out.println(sum / numbers.length);

        // 중앙값

        System.out.println();

        System.out.println();   // 최빈값
        System.out.println();   // 범위
        scan.close();

    }
}