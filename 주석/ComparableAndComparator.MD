# Comparable와 Comparator의 차이와 사용법

- ### [소스코드](https://github.com/audtjr9514/BaekJoon_Algorithm/blob/master/src/sort_compare_code.java)

- ### Comparable

  - 이 인터페이스를 구현한 객체 스스로에게 부여하는 한 하지 기본 정렬 규칙을 설정하는 목적

  - => 기본 정렬기준을 구현하는 데 사용

    ```java
    public interface Comparable{
        public int compareTo(Object O);
    }
    ```

    

- ### Comparator

  - 이 인터페이스를 구현한 클래스는 정렬 규칙 그 자체를 의미하며, 기본 정렬 규칙과 다르게
    원하는대로 정렬 순서를 지정하고 싶을 때 사용한다.

  - => 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용

    ```java
    public interface Comparator{
        int compare(Object o1, Object o2);
        boolean equals(object obj);
    }
    ```

    

- #### Compare()와 CompareTo()는 선언 형태와 이름만 약간 다를뿐, 두 객체를 비교한다는 같은 기능을 목적으로 고안되었다.

  - > comparteTo()의 반환값은 int이지만 비교하는 두 객체가
    > *같으면 0, 비교하는 값보다 작으면 음수, 크면 양수를 반환하도록 구현해야 한다.*

  - compare 또한 마찬가지이다.

  ```java
  Arrays.sort(arr);
  	// 객체 배열에 저장된 객체가 구현한 Comparable에 의한 정렬
  Arrays.sort(arr, new MyComparator());
  	// 직접 재정의한 Comparator에 의한 정렬
  ```

  - Comparable를 상속받아 처음부터 클래스 정의

  ```java
  // x좌표가 증가하는 순, x좌표가 같으면 y좌표가 감소하는 순으로 정렬하라.
  class Point implements Comparable<Point> {
      int x, y;
  
      @Override
      public int compareTo(Point p) {
          if(this.x > p.x) {
              return 1; // x에 대해서는 오름차순
          }
          else if(this.x == p.x) {
              if(this.y < p.y) { // y에 대해서는 내림차순
                  return 1;
              }
          }
          return -1;
      }
  }
  
  // main에서 사용법
  List<Point> pointList = new ArrayList<>();
  pointList.add(new Point(x, y));
  Collections.sort(pointList);
  ```

  - Comparator를 상속받은 새로운 class를 정의하여 적용

  ```java
  // x좌표가 증가하는 순, x좌표가 같으면 y좌표가 감소하는 순으로 정렬하라.
  class MyComparator implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
      if (p1.x > p2.x) {
        return 1; // x에 대해서는 오름차순
      }
      else if (p1.x == p2.x) {
        if (p1.y < p2.y) { // y에 대해서는 내림차순
          return 1;
        }
      }
      return -1;
    }
  }
  
  // main에서 사용법
  List<Point> pointList = new ArrayList<>();
  pointList.add(new Point(x, y));
  MyComparator myComparator = new MyComparator();
  Collections.sort(pointList, myComparator);
  ```

  - 위의 Comparator를 사용하는 다른 방식

  ```java
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
  ```

  

- #### 즉슨,  implements를 통한 재정의(Overriding)을 통해 기본적인 정렬의 규칙을 바꾸어 자신이 만든 정렬의 규칙을 사용하여 정렬을 사용하는 것이다.