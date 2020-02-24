# 입/출력 종류와 사용법



## 1. Scanner

- **Scanner Class**

  - `Scanner Class`는 *정수, 실수, 문자열*을 읽어올 수 있다.
  - JDK 1.5부터 추가
  - 이전의 문자, 숫자 입력을 받는 명령들보다 예외처리나, 수행속도 면에서 편리해 많이 쓰임
  - `System.in` 은 *입력한 값을 Byte 단위로 받아온다.*
  - **사용법** [소스 코드](https://github.com/audtjr9514/BaekJoon_Algorithm/blob/master/src/scanner_code.java)

  ~~~java
  import java.util.Scanner; 			// Scanner를 사용하기 위한 클래스 import
  
  public class scanner_code {
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);  // Scanner 선언
  
          char character = scan.next().charAt(0);	// 입력받은 라인의 첫번째를 char형으로 입력
          int integer_number = scan.nextInt();	// int형을 입력받음
          float real_number1 = scan.nextFloat();	// float형을 입력받음
          double real_number2 = scan.nextDouble();// double형을 입력받음
          String string1 = scan.next(); 		// 공백을 기준으로 입력을 받음
          String string2 = scan.nextLine(); 	// 한 라인을 기준으로 입력을 받는다.
  
          System.out.println(character);		// character 출력
          System.out.println(integer_number);	// int 출력
          System.out.println(real_number1);	// float 출력
          System.out.println(real_number2);	// double 출력
          System.out.println(string1);		// next입력 string 출력
          System.out.println(string2);		// nextLine string 출력
  
          scan.close(); 				// Scanner 종료
      }
  }
  ~~~

  > 입력 
  >
  > ```java
  > abc
  > 1
  > 123.12341234
  > 123.12341234
  > 가나다라 마바사 가나다라마바사
  > ```
  >
  > > 출력
  > >
  > > ```java
  > > a
  > > 1
  > > 123.12341
  > > 123.12341234
  > > 가나다라
  > >  마바사 가나다라마바사
  > > ```



------

### 2. BufferedReader / BufferedWriter

- **Stream**

  - `stream`이란 자료의 입/출력을 도와주는 중간 매개체이다.
  - `입력은 Reader / 출력은 Writer`가 뒤에 붙는다.
  - `stream`은 문자 단위 / 바이트 단위 차이의 두가지 종류가 있다.
    - 문자 단위 Class
      - **`Buffer`** ->`LineNumber`
      - `CharArray`
      - `InputStream` -> `File`
      - `Filter`
      - `Piped`
      - `String`
    - 바이트 단위 Class
      - `FileInput`
      - `PipedInput`
      - `FilterInput`
      - `ByteArrayInput`
      - `SequenceInput`
      - `StringBufferInput`
      - `ObjectInput`
        

- **BufferedReader / BufferedWriter**
  - `BufferedReader / BufferedWriter`는 버퍼스트림의 문자 단위 Class이다.
  - `Buffered` 클래스는 보조입출력스트림이다.
  - `Buffer`  
  - 데이터를 한 곳에서 다른 한곳으로 전송하는 동안 
    - 일시적으로 그 데이터를 보관하는 임시 메모리  영역
  - *`Scanner`는 `space / Enter`를 모두 경계로 인식*
      *`BufferedReader`는 Enter만을 경계로 인식하고, 받은 데이터를 String으로 고정시킨다.*
    > 위의 사항 때문에 데이터를 사용시 꼭 형변환을 해주어야 한다.
  - 하지만 `Scanner`에 비해 *많은 양의 데이터를 입력받거나 속도를 빨리 할 때* 훨씬 효율적이다.
  
  - **주요 메소드**
  
  | 메소드명                                       | 기능                                                         |
  | ---------------------------------------------- | ------------------------------------------------------------ |
  | BufferedReader(Reader rd)                      | rd에 연결되는 문자입력 버퍼스트림 생성                       |
  | BufferedWriter(Writer wt)                      | wt에 연결되는 문자출력 버퍼스트림 생성                       |
  | int read()                                     | 스트림으로부터 한 문자를 읽어서 int 형으로 리턴              |
  | int read(char[] buf)                           | 문자배열 buf의 크기만큼 문자를 읽어들임. 읽어들인 문자 수를 리턴 |
  | int read(char[] buf, int offset, int length)   | buf의 offset위치에서부터 length 길이만큼 문자를 스트림으로부터 읽어들임 |
  | String readLine()                              | 스트림으로부터 한 줄을 읽어 문자열로 리턴                    |
  | void mark()                                    | 현재우치를 마킹, 차 후 reset() 을 이용하여 마킹위치부터 시작함 |
  | void reset()                                   | 마킹이 있으면 그 위치에서부터 다시시각, 그렇지 않으면 처음부터 다시시작 |
  | long skip(int n)                               | n 개의 문자를 건너 뜀                                        |
  | void close()                                   | 스트림 닫음                                                  |
  | void write(int c)                              | int 형으로 문자 데이터를 출력문자스트림으로 출력             |
  | void write(String s, int offset, int length)   | 문자열 s를 offset 위치부터 length 길이만큼을 출력스트림으로 출력 |
| void write(char[] buf, int offset, int length) | 문자배열 buf의 offset 위치부터 length 길이만큼을 출력스트림으로 출력 |
  | void newLine()                                 | 줄바꿈 문자열 출력                                           |
| void flush()                                   | 남아있는 데이터를 모두 출력시킴.                             |
  
  - **사용법** [소스 코드](https://github.com/audtjr9514/BaekJoon_Algorithm/blob/master/src/bufferstream_code.java)
  
  ```java
  import java.io.BufferedReader;        // io패키지의 BufferedReader 클래스 import
  import java.io.BufferedWriter;        // io패키지의 BufferedWriter 클래스 import
  import java.io.IOException;
  // 예외처리를 위해 io패키지의 IOException 클래스 import
  import java.io.InputStreamReader;    // io패키지의 InputStreamReader 클래스 import
  import java.io.OutputStreamWriter;    // io패키지의 InputStreamReader 클래스 import
  
  public class bufferstream_code {
      public static void main(String[] args) throws IOException {
          // 예외처리를 위해 IOException을 throws 해준다.
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          // 입력을 위한 BufferedReader 스트림 생성
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          // 출력을 위한 BufferedWriter 스트림 생성
  
          char character = br.readLine().charAt(0);
          // 입력 한줄을 받아와 그 첫번째 문자를 char형으로 변환
          int int_number = Integer.parseInt(br.readLine());
          // 입력 한줄을 받아 int형으로 변환
          float float_number = Float.parseFloat(br.readLine());
          // 입력 한줄을 받아 int형으로 변환
        double double_number = Double.parseDouble(br.readLine());
          // 입력 한줄을 받아 int형으로 변환
          String string = br.readLine();
          // 입력 자체가 String이므로 변환할 필요가 없다.
  
          bw.write(character);
          bw.newLine();
          bw.write(String.valueOf(int_number));
          bw.newLine();
          bw.write(String.valueOf(float_number));
          bw.newLine();
          bw.write(String.valueOf(double_number));
          bw.newLine();
          // 위의 세 문장에서 String.valueOf()를 사용하지 않을시 오류 발생
          // int 형의 경우 오류는 나지 않으나 아스키 코드로 출력
          bw.write(string);
          bw.newLine();
          // 개행하는 법 1 : bw.write(str+ '\n');
          //           2 : bw.newLine();
  
          br.close(); // 입력 스트림 닫기
          bw.close(); // 출력 스트림 닫기
      }
  }
  ```
  
  > 입력 
  >
  > ```java
  > abc
  > 123
  > 123.12341234
  > 123.12341234
  > Hello World!
  > ```
  >
  > > 출력
  > >
  > > ```java
  > > a
  > > 123
  > > 123.12341
  > > 123.12341234
  > > Hello World!
  > >  ```
------

### 3. StringTokenizer
- **StringTokenizer**
  - `StringTokenizer` class : `String`을 구획문자 기준으로 `token` 단위로 끊어준다.
  - 디폴트 구획문자 : *`\t, \n, \r, \f`*
  - `BufferReader` 스트림을 이용할 시에 String으로 받아오기 때문에 구획문자를 기준으로 끊어서 
    사용할 때, 편리하게 사용하기 위해서 사용한다.
  - `split`과의 차이점 
    - `split`은 정규식을 기반으로 자르는 로직으로서 내부는 복잡하다.
    - 하지만 `nextToken()`은 단순히 공백 자리를 땡겨 채우는 것이기 때문에 속도 차이가 현저히 난다.
  - **생성자**

  | 메소드 명                                                 | 기능                                                         |
  | --------------------------------------------------------- | ------------------------------------------------------------ |
  | **StringTokenizer(String str)**                           | **구획문자(delimiter)를 인자로 받지않는 생성자. <br />디폴트 구획문자로 공백문자(\t, \n, \r, \f)를 가진다.** |
  | StringTokenizer(String str, String delim)                 | 구획문자(delimiter)를 인자로 받는 생성자. 구획문자는 2자리 이상도 <br />설정할 수 있다. 구획문자를 $%라고 설정하면 $, %를 기준으로 끊어준다. <br />%%라고 설정하면 %를 기준으로 끊어준다. 즉 구획 문자는 길이가 1로 <br />고정이고 길이가 2이상인 구획문자를 받으면 구획문자가 여러개가 된다. |
  | StringTokenizer(String str, String delilm, String delilm) | 구획문자(delimiter)를 인자로 받는 생성자. returnDelims가 true이면 <br />구획문자도 토큰으로 간주한다. 각 구획문자는 길이가 1인 String이 된다. <br />예를들어 delimiter가 %%라도 % 2개로 저장된다.  returnDeilms가 false면 구획문자를 token으로 사용하지 않는다. <br />위의 두 생성자는 디폴트로 false를  가진다. |

  - **주요 메소드**

  | 메소드 명               | 기능                                                         |
  | ----------------------- | ------------------------------------------------------------ |
  | countTokens()           | 토큰의 갯수를 리턴한다.                                      |
  | **nextToken()**         | **다음 토큰을 리턴한다. 이전 토큰은 제거한다.**              |
  | nextToken(String delim) | 획문자(delimiter)를 delim으로 바꾼 후 바뀐 다음 토큰을 리턴한다.<br /> 예를들어 this$1is$1string 이라고 하면 생성자에서 구획문자를$1로 <br />설정했다가 nextToken으로 this를 받고 2번째 nextToken은 delim을<br /> $로 받으면 (nextToken("$")) 1is를 리턴한다. |
  | hasMoreTokens()         | 리턴할 다음 토큰이 있으면 true를 다음 토큰이 없으면 false를 리턴한다. |

  - **사용법** [소스 코드](https://github.com/audtjr9514/BaekJoon_Algorithm/blob/master/src/stringtokenizer_code.java)

  ```java
  import java.io.BufferedReader;
  import java.io.BufferedWriter;
  import java.io.IOException;
  import java.io.InputStreamReader;
  import java.io.OutputStreamWriter;
  import java.util.StringTokenizer; // util 패키지의 StringTokenizer 클래스 import
  
  public class stringtokenizer_code {
      public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          StringTokenizer st; 				    // StringTokenizer 선언
  
          int[] numbers = new int[10];
          
          st = new StringTokenizer(br.readLine());
          // 입력을 받아와 StringTokenizer 상태로 입력받아옴
          for (int i = 0; i < 10; i++)
              numbers[i] = Integer.parseInt(st.nextToken());
          	// 각 토큰을 int형으로 변환 하여 배열에 초기화
          
          for (int number : numbers)
              bw.write(String.valueOf(number) + ' ');
  
          br.close();
          bw.close();
      }
  }
  ```

  > 입력 
  >
  > ```java
  > 1 2 3 4 5 6 7 8 9 10 
  > // 만약 1을 치고 엔터를 친다면 오류가 발생한다.
  > // 엔터를 친다면 이미 한줄을 읽어 온것이기 때문에 토큰이 하나이기 때문이다.
  > ```
  >
  > > 출력
  > >
  > > ```java
  > > 1 2 3 4 5 6 7 8 9 10 
  > > ```