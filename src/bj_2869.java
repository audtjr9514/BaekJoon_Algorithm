import java.util.Scanner;

public class bj_2869 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int up = scan.nextInt();
        int down = scan.nextInt();
        int height = scan.nextInt();

        int day = (height - down) / (up - down);
        // 정상을 도착할 때 내려가는 일은 없으므로 정상에서 Down만큼 빼준다.
        if ((height - down) % (up - down) > 0)
            day++;
        // 하지만 하루치 이하의 높이가 남았을수도 있으므로 만약 나머지가 있을 경우 하루를 추가해준다.
        System.out.println(day);
        scan.close();
    }
}
