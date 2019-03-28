import java.util.Scanner;

public class bj_2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        String[] out = new String[test];
        for (int i = 0; i < test; i++) {
            int num = scan.nextInt();
            String[] in = scan.next().split("");

            for (int j = 0; j < in.length; j++) {
                out[j] = "";
                for (int k = 0; k < num; k++)
                    out[j] += in[k];
            }

        }
        for (String s : out)
            System.out.println(s);

    }
}
