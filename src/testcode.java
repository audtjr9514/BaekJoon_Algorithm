import java.util.Scanner;
import java.util.Arrays;

class Point {
    int x = 0, y = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class testcode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        Point[] points = new Point[num];

        for (int i = 0; i < num; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            points[i] = new Point(x,y);
        }
        Arrays.sort(points, (Point p1, Point p2) -> {
                    if (p1.x > p2.x) {
                        return 1; // x에 대해서는 오름차순
                    } else if (p1.x == p2.x) {
                        if (p1.y < p2.y) { // y에 대해서는 내림차순
                            return 1;
                        }
                    }
                    return -1;
                }
        );

        for (Point xy : points)
            System.out.println(xy.x + " " + xy.y);
    }
}