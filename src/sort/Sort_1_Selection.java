package sort;

public class Sort_1_Selection {
    public static void main(String[] args) {
        int[] a = {69, 10, 30, 2, 16, 8, 31, 22};
        System.out.print("정렬전: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        Selection_Sort.selectionSort(a);

        System.out.print("정렬후: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}

class Selection_Sort {
    public static void selectionSort(int[] a) {
        int min;
        for (int i = 0; i < a.length - 1; i++) {
            // a[i], a[i+1], ... 중에서최소값의인덱스min을찾음
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            // a[i]와최소원소a[min]의자리를교환
            swap(a, min, i);
        }
    }

    private static void swap(int[] a, int i, int j) {
        // a[i]와a[j]를교환
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
