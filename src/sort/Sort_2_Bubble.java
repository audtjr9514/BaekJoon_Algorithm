package sort;

public class Sort_2_Bubble {
    public static void main(String[] args) {
        int[] a = {254, 3, 213, 64, 75, 56, 4, 324, 65, 78, 9, 5, 76, 3410, 8, 342, 76};
        System.out.print("정렬전: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        int b;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    b = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = b;
                }
            }
        }

        System.out.print("정렬후: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
