import java.util.Scanner;

public class bj_4344 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double[] cases = new double[num];
        for (int i = 0; i < num; i++) {
            int test = scan.nextInt();
            double sum = 0;
            int[] stu = new int[test];
            for (int j = 0; j < test; j++) {
                stu[j] = scan.nextInt();
                sum += stu[j];
            }
            cases[i] = 0;
            for (int k = 0; k < test; k++) {
                if (stu[k] > (sum / test))
                    cases[i] += 1;
            }
            cases[i] = cases[i] / test * 100;

        }
        for (double avg : cases) {
            System.out.printf("%.3f%%\n", avg);
        }
    }
}