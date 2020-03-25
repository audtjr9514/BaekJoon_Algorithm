import java.util.Scanner;

public class bj_2902 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = scan.next().split("-");
        for(String s : str)
            System.out.print(s.charAt(0));
    }
}
