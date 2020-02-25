package sort;

public class Sort_5_Quick {
    static int i = 0;
    static int size;

    public static int partition(int[] a, int begin, int end) {
        int pivot, temp, L, R;
        i++; //연산 횟수
        L = begin;
        R = end;
        pivot = (int) ((begin + end) / 2);
        System.out.println(i + "단계: pivot=" + a[pivot]);
        //1. while(L<R)인경우
        while (L < R) {
            while ((a[L] <= a[pivot]) && (L <= R)) L++;
            while ((a[R] > a[pivot]) && (L <= R)) R--;
            if (L <= R) {
                temp = a[L];
                a[L] = a[R];
                a[R] = temp;
                if (R == pivot) { // L과 R 원소를 교환하여 결과적으로 pivot 원소의 위치가 변경된 경우
                    for (int t = 0; t < size; t++) {
                        System.out.print(a[t] + " ");
                    }
                    System.out.println();
                    return L; // L은 확정된 pivot의 위치
                }
            }
        }
        //2. while(L>R)인 경우
        temp = a[pivot];
        a[pivot] = a[R];
        a[R] = temp;
        for (int t = 0; t < size; t++) {
            System.out.print(a[t] + " ");
        }
        System.out.println();
        return R;//R은 확
    }

    public static void quickSort(int[] a, int begin, int end) {
        if (begin < end) {
            int p = partition(a, begin, end);
            quickSort(a, begin, p - 1);// pivot의 왼쪽 부분집합에 대해 퀵 정렬 재귀호출
            quickSort(a, p + 1, end);//pivot의 오른쪽 부분집합에 대해 퀵 정렬 재귀호출
        }
    }

    public static void main(String[] args) {
        int[] a = {69, 10, 30, 2, 16, 8, 31, 22};

        System.out.print("정렬전: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        size = a.length;
        quickSort(a, 0, size - 1);

        System.out.print("정렬후: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
