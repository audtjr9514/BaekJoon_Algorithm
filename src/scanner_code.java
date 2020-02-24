import java.util.Scanner; 						// Scanner를 사용하기 위한 클래스 import

public class scanner_code {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Scanner 선언

        char character = scan.next().charAt(0);	// 입력받은 라인의 첫번째를 char형으로 입력
        int integer_number = scan.nextInt();	// int형을 입력받음
        float real_number1 = scan.nextFloat();	// float형을 입력받음
        double real_number2 = scan.nextDouble();// double형을 입력받음
        String string1 = scan.next(); 			// 공백을 기준으로 입력을 받음
        String string2 = scan.nextLine(); 		// 한 라인을 기준으로 입력을 받는다.

        System.out.println(character);			// character 출력
        System.out.println(integer_number);		// int 출력
        System.out.println(real_number1);		// float 출력
        System.out.println(real_number2);		// double 출력
        System.out.println(string1);			// next입력 string 출력
        System.out.println(string2);			// nextLine string 출력

        scan.close(); 							// Scanner 종료
    }
}