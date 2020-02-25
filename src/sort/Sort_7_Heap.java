package sort;

public class Sort_7_Heap {
    private static int[] a;
    private static int number = 10;

    public static void heap(int[] a, int number) {
        for (int i = 1; i < number; i++) {
            int child = i;
            while (child > 0) {
                int parent = (child - 1) / 2;
                if (a[child] > a[parent]) {
                    int temp = a[parent];
                    a[parent] = a[child];
                    a[child] = temp;
                }
                child = parent;
            }
        }
    }

    public static void main(String[] args) {
        a = new int[number];
        for (int i = 0; i < number; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.print("정렬 전 : ");
        for (int i = 0; i < number; i++) {
            System.out.print(a[i] + " ");
        }
        heap(a, number);
        for (int i = number - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heap(a, i);
        }
        System.out.print("\n정렬 후 : ");
        for (int i = 0; i < number; i++) {
            System.out.print(a[i] + " ");
        }
    }
}