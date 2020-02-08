public class bj_4673 {
    public static boolean[] self_num = new boolean[10001];

    public static int d(int n) {
        int check = 0;
        if (n < 10) {
            check = 2 * n;
            System.out.println(check + "는 셀프넘버가 아닙니다.");
            self_num[check] = true;
        } else if (n >= 10 && n < 100) {
            check += n + n / 10 + n % 10;
            System.out.println(check + "는 셀프넘버가 아닙니다.");
            self_num[check] = true;
        } else if (n >= 100 && n < 1000) {
            check = n + n / 100 + (n % 100) / 10 + n % 10;
            System.out.println(check + "는 셀프넘버가 아닙니다.");
            self_num[check] = true;

        } else if (n >= 1000 && n < 10000) {
            check = n + n / 1000 + (n % 1000) / 100 + (n % 100) / 10 + n % 10;
            System.out.println(check + "는 셀프넘버가 아닙니다.");
            if (check >= 10000)
                return 0;

            self_num[check] = true;
        } else {
            return 0;
        }
        return d(check);
    }

    public static void main(String[] args) {
        for (int n = 1; n < 10000; n++)
            d(n);
//        for (int n = 1; n < 10000; n++)
//            if (self_num[n] == false)
//                System.out.println(n);
    }
}
