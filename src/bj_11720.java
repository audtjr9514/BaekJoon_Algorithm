import java.util.Scanner;
public class bj_11720 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        String str = scan.next();

        int sum = 0;
        for(int i=0; i<x; i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.print(sum);
    }
}