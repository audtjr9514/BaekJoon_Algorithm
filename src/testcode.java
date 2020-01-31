import java.util.Scanner;

public class testcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt(); //케이스 수
        int n; //학생수
        int[] score; //각 케이스별 점수를 갖는 배열
//        int[] sc_sum = new int[c];//각 케이스별 점수 합계 배열
//        double avg[] = new double[c]; //각 케이스별 점수 평균 배열
//        double[] over_student = new double[c]; //각 케이스별 평균을 넘는 학생의 수 배열
        double[] ratio = new double[c]; //각 케이스별 평균을 넘는 학생의 비율 배열

        for (int i = 0; i < c; i++) {
            n = sc.nextInt();
            score = new int[n];
            int sc_sum = 0;
            double over_student = 0;

            for (int j = 0; j < score.length; j++) {
                score[j] = sc.nextInt(); //각 점수를 입력받아 score배열에 저장
                sc_sum += score[j];
            }
            double avg = sc_sum / n; //한 케이스의 평균 구함

            for (int j = 0; j < n; j++) {
                if (score[j] > avg) {
                    over_student++; //평균을 넘는 학생수 구함
                }
            }
            ratio[i] = over_student / n * 100; //평균을 넘는 학생 수 비율 구함
        }

        for (int i = 0; i < c; i++) {
            System.out.println(String.format("%.3f", ratio[i]) + "%"); //반올림 하여 소수점 셋째자리까지 출력
        }
    }
}