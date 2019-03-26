import java.util.Scanner;

public class bj_2920 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[8];
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i + 1] - 1)
                str = "ascending";
            else if (arr[i] == arr[i + 1] + 1)
                str = "descending";
            else {
                str = "mixed";
                break;
            }
        }
        System.out.println(str);
    }
}
