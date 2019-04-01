import java.util.Scanner;

public class bj_2292 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int des = 1, count = 1;
        while (des < num) {
            des += (count * 6);
            count += 1;
        }
        System.out.println(count);
    }
}
/*
1       /1/             1
2 ~ 7   /2/   6*0 + 2   6*1 + 1
8 ~ 19  /3/   6*1 + 2   6*(1+2) + 1
20 ~ 37 /4/   6*3 + 2   6*(1+2+3) + 1
38 ~ 61 /5/   6*6 + 2   6*(1+2+3+4) +1
 */

