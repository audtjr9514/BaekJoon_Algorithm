public class bj_4673 {
    public static int d(int n){
        return n;
    }

    public static void main(String[] args) {
        int n = 33;
        int new_num = n + n / 1000 + n / 100 + n / 10 + n % 10;
    }
}
