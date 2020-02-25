package sort;

public class Sort_3_Insertion {
    public static void main(String[] args) {
        int[] a = {10, 2, 6, 4, 3, 7, 5};
        System.out.print("정렬전: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        for (int i = 1; i < a.length; i++) {
            int standard = a[i];  // 기준
            int aux = i - 1;   // 비교할 대상

            while (aux >= 0 && standard < a[aux]) {
                a[aux + 1] = a[aux];   // 비교대상이 큰 경우 오른쪽으로 밀어냄
                aux--;
            }
            a[aux + 1] = standard;  // 기준값 저장
        }

        System.out.print("정렬후: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
