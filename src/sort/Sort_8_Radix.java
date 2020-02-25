package sort;

import java.util.Arrays;

public class Sort_8_Radix {
// 배열에서 최대값을 얻기 위한 메서드
static int getMax(int[] a) {
    int mx = a[0];
    for (int i = 1; i < a.length; i++) {
        if (a[i] > mx) {
            mx = a[i];
        }
    }
    return mx;
}

// exp 변수의 수에 따라 숫자를 정렬
static void countSort(int[] a, int exp) {
    int[] output = new int[a.length];
    int[] count = new int[10];
    Arrays.fill(count, 0);

    // count 값 count배열에 저장
    for (int i = 0; i < a.length; i++) {
        count[(a[i] / exp) % 10]++;
    }
    // count 값이 포함시켜 count배열에 저장
    for (int i = 1; i < 10; i++) {
        count[i] += count[i - 1];
    }
    // output배열 빌드
    for (int i = a.length - 1; i >= 0; i--) {
        output[count[(a[i] / exp) % 10] - 1] = a[i];
        count[(a[i] / exp) % 10]--;
    }
    // output 배열에 저장된 값을 a 배열에 저장
    for (int i = 0; i < a.length; i++) {
        a[i] = output[i];
    }
}

static void radixsort(int[] a) {
    // 최대값 찾기
    int m = getMax(a);
    for (int exp = 1; m / exp > 0; exp *= 10) {
        countSort(a, exp);
    }
}

public static void main(String[] args) {
    int[] a = {4, 54, 2, 8, 63, 7, 55, 56};
    System.out.print("정렬전: ");
    for (int i = 0; i < a.length; i++)
        System.out.print(a[i] + " ");
    System.out.println();

    radixsort(a);
    // 기수 정렬 후
    System.out.print("정렬후: ");
    for (int i = 0; i < a.length; i++)
        System.out.print(a[i] + " ");
}
}
