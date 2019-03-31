import java.util.Scanner;

public class bj_5622 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = scan.next().split("");
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("A") || str[i].contains("B") || str[i].contains("C"))
                sum += 3;
            else if (str[i].contains("D") || str[i].contains("E") || str[i].contains("F"))
                sum += 4;
            else if (str[i].contains("G") || str[i].contains("H") || str[i].contains("I"))
                sum += 5;
            else if (str[i].contains("J") || str[i].contains("K") || str[i].contains("L"))
                sum += 6;
            else if (str[i].contains("M") || str[i].contains("N") || str[i].contains("O"))
                sum += 7;
            else if (str[i].contains("P") || str[i].contains("Q") || str[i].contains("R") || str[i].contains("S"))
                sum += 8;
            else if (str[i].contains("T") || str[i].contains("U") || str[i].contains("V"))
                sum += 9;
            else if (str[i].contains("W") || str[i].contains("X") || str[i].contains("Y") || str[i].contains("Z"))
                sum += 10;
        }
        System.out.println(sum);
        scan.close();
    }
}
