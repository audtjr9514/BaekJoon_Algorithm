import java.util.Scanner;

public class bj_2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        String[] out = new String[test];
        int[] repeat = new int[test];

        for (int i = 0; i < test; i++) {
            repeat[i] = scan.nextInt();
            out[i] = scan.next();
        }
        String testcase = "";
        for (int i = 0; i < out.length; i++) {
            for (int k = 0; k < out[i].length(); k++) {
                for (int j = 0; j < repeat[i]; j++) {
                    testcase += out[i].charAt(k);
                }
            }
            System.out.println(testcase);
            testcase ="";
        }
    }
}
