import java.math.BigInteger;
import java.util.Scanner;

public class bj_10757 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().split(" ");
        System.out.println(new BigInteger(str[0]).add(new BigInteger(str[1])));
    }
}
