/*
조건: r1<=r2
(1) 두 점에서 만나는 경우
    r2 - r1 < d < r1 + r2
(2) 한 점에서 만나는 경우
    r1 + r2 = d
    r2 - r1 = d
(3) 만나지 않는 경우
    r1 + r2 < d
    r2 - r1 > d
    x1=x2 && y1=y2(두 좌표가 같은 경우) && r1 != r2
(4) 무한대가 출력되는 경우 = 두 원이 완전히 겹치는 경우
    x1=x2 && y1=y2(두 좌표가 같은 경우) && r1 = r2
 */

import java.util.Scanner;
import java.lang.Math;

public class bj_1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();
        for (int i = 0; i < testcase; i++) {
            int x1 = scan.nextInt(); // A 원 중심의 x 좌표
            int y1 = scan.nextInt(); // A 원 중심의 y 좌표
            int r1 = scan.nextInt(); // A 원의 반지름
            int x2 = scan.nextInt(); // B 원 중심의 x 좌표
            int y2 = scan.nextInt(); // B 원 중심의 y 좌표
            int r2 = scan.nextInt(); // B 원 반지름


            // 두 원의 중심간의 거리
            double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            int rpr = r1 + r2;
            int rmr = Math.abs(r1 - r2);

            if (x1 == x2 && y1 == y2) {
                if (r1 == r2) System.out.println("-1");
                if (r1 != r2) System.out.println("0");
            } else {
                if (d == rpr || d == rmr) System.out.println("1");
                if (d < rpr && d > rmr) System.out.println("2");
                if (d > rpr || d < rmr) System.out.println("0");
            }
        }
        scan.close();
    }
}
