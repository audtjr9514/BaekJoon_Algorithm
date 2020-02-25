# 정렬

- ### INDEX

  - #### [정렬 (Sort)](#정렬-Sort-1)

  - #### [정렬 알고리즘의 선택시 고려사항](#정렬-알고리즘의-선택-시-고려-사항-1)

  - #### [정렬의 방식](#정렬의-방식-1)

  - #### [정렬의 종류](#정렬의-종류-1)

    **[1. 선택 정렬 ( Selection Sort )](#1-선택-정렬--selection-sort-)**

    **[2. 버블 정렬 ( Bubble Sort )](#2-버블-정렬--bubble-sort-)**

    **[3. 삽입 정렬 ( Insertion Sort )](#3-삽입-정렬--insertion-sort-)**

    **[4. 셸 정렬 ( Shell Sort )](#4-셸-정렬--shell-sort-)**

    **[5. 퀵 정렬 ( Quick Sort )](#5-퀵-정렬--quick-sort-)**

    **[6. 병합 정렬 ( Merge Sort )](#6-병합-정렬--merge-sort-)**

    **[7. 힙 정렬 ( Heap Sort )](#7-힙-정렬--heap-sort-)**

    **[8. 기수 정렬 ( Radix Sort )](#8-기수-정렬--radix-sort-)**

------

- ### 정렬 (Sort)

  - 순서 없이 배열된 자료들을 어떤 기준에 따라 `오름차순(ascending order)` 또는 `내림차순(descending order)`으로 재배열하는 것
  - 자료를 정렬하는 데 기준이 되는 특정 값을 `키(Key)`라고 한다.

------

- ### 정렬 알고리즘의 선택 시 고려 사항

  - 시간 복잡도
  - 구현의 간단함
  - 자료의 양
  - 정렬의 안정 정렬 (Stable)
    - `안정 정렬(Stable Sort) `: 
      정렬되지 않은 상태에서 같은 키값을 가진 원소의 순서가 정렬후에도 유지가 되는가?
  - 자료를 저장한 메모리 이외의 정렬에 필요한 추가메모리가 O(1)인가?
  - 이미 정렬되어 있는 경우(또는 거의 정렬되어있는 경우) 더 신속하게 정렬 가능한가?
  - 동적으로 새로운 자료를 추가하면서 정렬이 가능한가?

------

- ### 정렬의 방식

  - #### **내부 정렬 (Internal Sort)**

      > 정렬한 자료를 메인 메모리에 올려서 정렬
      > 정렬 속도가 빠르나, 정렬할 수 있는 자료의 양이 메인 메모리의 용량에 따라 제한됨

    - **교환 방식**
      - 버블정렬 ( Bubble Sort )
      - 퀵정렬 ( Quick Sort )
    - **선택 방식**
      - 선택정렬 ( Selection Sort )
      - 힙정렬 ( Heap Sort )
    - **삽입 방식**
      - 삽입 정렬 ( Insertion Sort )
      - 셸 정렬 ( Shell Sort )
      - 트리 정렬 ( Tree Sort)
    - **병합 방식**
      - 병합 정렬 ( Merge Sort )

    - **분배 방식**
      - 기수 정렬 ( Radix Sort ) 
    
  - #### 외부 정렬(External Sort)
  
      > 정렬할 자료를 보조 기억장치에 두고 정렬
      > 내부 정렬보다 속도는 떨어지나, 내부 정렬로는 처리할 수 없는 대용량 자료에 대한 정렬 가능

------

- ### 정렬의 종류
  
  - #### [1. 선택 정렬 ( Selection Sort )](<https://github.com/audtjr9514/BaekJoon_Algorithm/blob/master/src/sort/Sort_1_Selection.java>)
    
    > **전체 원소들 중에서 기준 위치에 맞는 원소를 `선택`하여 그 기준위치에 저장하는 방식으로 정렬**
    - **시간 복잡도 : `O(n^2)`**
    - **수행 방법**
      1. 전체 원소 중에서 가장 작은 원소를 찾아서 선택하여 첫번째 원소와 자리를 교환
      2. 두 번째로 작은 원소를 찾아 선택하여 두 번째 원소와 자리를 교환한다.
      3. 세 번째로 작은 원소를 찾아서 세 번째 원소와 자리를 교환
      4. 이 과정을 마지막 순서까지 반복
    
    ```java
    class Selection_Sort {
        public static void selectionSort(int[] a) {
            int min;
            for (int i = 0; i < a.length - 1; i++) {
                // a[i], a[i+1], ... 중에서최소값의인덱스min을찾음
                min = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] < a[min])
                        min = j;
                }
                // a[i]와최소원소a[min]의자리를교환
                swap(a, min, i);
            }
        }
    
        private static void swap(int[] a, int i, int j) {
            // a[i]와a[j]를교환
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    ```
    
    > ```java
    > 정렬전: 69 10 30 2 16 8 31 22 
    > 정렬후: 2 8 10 16 22 30 31 69 
    > ```
    
  -----------------
  
  - #### [2. 버블 정렬 ( Bubble Sort )](<https://github.com/audtjr9514/BaekJoon_Algorithm/blob/master/src/sort/Sort_2_Bubble.java>)
  
    > **인접한 두 개의 원소를 빅하여 정렬 기준에 맞지 않으면 자리를 `교환`하는 방식으로 정렬**
  
    - **평균 시간 복잡도 : `O(n^2)`**
    - **수행 방법**
      1. 첫 번째 원소부터 마지막 원소까지 비교-교환 작업을 반복하면 가장 큰 원소가 마지막 위치에 놓인다.
      2. 가장 큰 원소를 제외하고, 나머지 원소들에 대해 위의 작업을 반복하면 두 번째 큰 원소가 뒤에서
         두 번째 큰 원소가 뒤에서 두번째 위치에 놓인다.
      3. 가장 큰 원소 두 개를 제외하고 위의 작업을 반복하면 세 번째 큰 원소가 뒤에서 세 번째 위치에 
         놓인다.
      4. 이 과정을 마지막 순서까지 반복;
  
    ```JAVA
    public class Sort_2_Bubble {
        public static void main(String[] args) {
          int[] a = 
            	{254, 3, 213, 64, 75, 56, 4, 324, 65, 78, 9, 5, 76, 3410, 8, 342, 76};
            System.out.print("정렬전: ");
            for (int i = 0; i < a.length; i++)
                System.out.print(a[i] + " ");
            System.out.println();
    
            int b;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length - i - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        b = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = b;
                    }
                }
            }
    
            System.out.print("정렬후: ");
            for (int i = 0; i < a.length; i++)
                System.out.print(a[i] + " ");
        }
    }
    ```
    
    > ```java
    > 정렬전: 254 3 213 64 75 56 4 324 65 78 9 5 76 3410 8 342 76 
    > 정렬후: 3 4 5 8 9 56 64 65 75 76 76 78 213 254 324 342 3410 
    > ```
  
  -----------------
  
  - #### [3. 삽입 정렬 ( Insertion Sort )](<https://github.com/audtjr9514/BaekJoon_Algorithm/blob/master/src/sort/Sort_3_Insertion.java>)
  
    > **이미 정렬되어 있는 부분에 새로운 원소의 위치를 찾아 `삽입`하는 방식으로 정렬**
  
    - **평균 시간 복잡도 : `O(n2)`**
    - **수행 방법**
      1. 원소들을 두 개의 부분 S와 U로 나누어 생각하자.
         - S : 이미 정렬된 앞 부분의 원소들
         - U : 아직 정렬되지 않은 나머지 원소들
      2. U의 원소를 하나씩 꺼내서 S의 마지막 원소부터 비교하면서 위치를 찾아 삽입한다.
      3. U가 공집합이 되면 삽입 정렬이 완성
    
  ```JAVA
    public class Sort_3_Insertion {
        public static void main(String[] args) {
            int[] a = {10, 2, 6, 4, 3, 7, 5};
            System.out.print("정렬전: ");
            for (int i = 0; i < a.length; i++)
                System.out.print(a[i] + " ");
            System.out.println();
    
            for (int i = 1; i < a.length; i++) {
                int standard = a[i];  // 기준
                int aux = i - 1;   // 비교할 대상
    
                while (aux >= 0 && standard < a[aux]) {
                    a[aux + 1] = a[aux];   // 비교대상이 큰 경우 오른쪽으로 밀어냄
                    aux--;
                }
                a[aux + 1] = standard;  // 기준값 저장
            }
    
            System.out.print("정렬후: ");
            for (int i = 0; i < a.length; i++)
                System.out.print(a[i] + " ");
        }
    }
    
  ```
  
    > ```java
    > 정렬전: 10 2 6 4 3 7 5 
    > 정렬후: 2 3 4 5 6 7 10 
    > ```
  -----------------
  
  - #### [4. 셸 정렬 ( Shell Sort )](<https://github.com/audtjr9514/BaekJoon_Algorithm/blob/master/src/sort/Sort_4_Shell.java>)
  
    > **일정한 간격으로 떨어져 있는 원소들을 부분 집합으로 하여 이 부분 집합에 대해서 `삽입 정렬`을 수행하고, 이 과정을 반복하여 전체 원소들을 정렬**
  
    - **평균 시간 복잡도 : `비교횟수가 매개변수에 의해 영향을 받으므로 성능 측정이 어려움`**
      								**`삽입정렬의 시간 복잡도보다는 개선됨`**
    - **수행 방법**
      1. 부분 집합을 만드는 기준이 되는 간격을 매개 변수 h에 저장
      2. 한 단계가 수행될 때마다 h의 값을 감소시킴
      3. h가 1이 될 때까지 단계를 반복
    
      - 셀 정렬의 성능은 간격(매개변수 h)의 값에 따라 달라짐
        - 원소 개수가 n일 때, 일반적으로 초기 h는 n/2를 사용, 
          한 단계 수행될 때마다 h를 반으로 감소시킨다
  
    ```JAVA
    public static void intervalSort(int a[], int begin, int end, int interval) {
        int j;
        for (int i = begin + interval; i <= end; i = i + interval) {
            int item = a[i];
            for (j = i - interval; j >= begin && item < a[j]; j = j - interval) {
            	a[j + interval] = a[j];
          	}
            a[j + interval] = item;
        }
    }
    
    public static void shellSort(int[] a, int size) {
        int interval = size / 2;
        while (interval >= 1) {
            for (int i = 0; i < interval; i++) {
                 intervalSort(a, i, size - 1, interval);
            }
            System.out.println("- interval = " + interval);
            for (int t = 0; t < size; t++) {
    			System.out.print(a[t] + " ");
            }
            System.out.println();
            interval = interval / 2;
        }
    }
    ```
    
    > ```java
    > 정렬전: 16 7 30 3 69 9 31 23 
    > - interval = 4
    > 16 7 30 3 69 9 31 23 
    > - interval = 2
    > 16 3 30 7 31 9 69 23 
    > - interval = 1
    > 3 7 9 16 23 30 31 69 
    > 정렬후: 3 7 9 16 23 30 31 69 
    > ```
  
  -----------------
  
  - #### [5. 퀵 정렬 ( Quick Sort )](https://github.com/audtjr9514/BaekJoon_Algorithm/blob/master/src/sort/Sort_5_Quick.java>)
  
    > **기준 값을 중심으로 왼쪽 부분과 오른쪽 부분으로 분할한 후, 이 두 부분을 따로 정렬하여 모으는 방식으로 정렬**
  
    - **평균 시간 복잡도 : `O(n log2n)`**
    - **수행 방법**
      
      - 분할 과정에서 왼쪽 부분에는 기준 값보다 작은 원소들을 이동시키고, 오른쪽 부분에는 기준값보다 큰 원소들을 이동시킨다.
      
      - 기준 값 : Pivot(피봇)
      - 정렬 대상 원소 중에서 가운데 위치한 원소를 기준 값으로 선택 가능
        - 피봇이 중앙 값에 가까울 수록 퀵 정렬의 성능이 향상됨
      - **분할-정복 ( Divide-and-Conquer**) 기법의 알고리즘
        - divide 분할
      - conquer 정복
        - combine 조합
    
    ```JAVA
    public class Sort_5_Quick {
        static int i = 0;
        static int size;
    
        public static int partition(int[] a, int begin, int end) {
            int pivot, temp, L, R;
            i++; //연산 횟수
            L = begin;
            R = end;
            pivot = (int) ((begin + end) / 2);
            System.out.println(i + "단계: pivot=" + a[pivot]);
            //1. while(L<R)인경우
            while (L < R) {
                while ((a[L] <= a[pivot]) && (L <= R)) L++;
                while ((a[R] > a[pivot]) && (L <= R)) R--;
                if (L <= R) {
                    temp = a[L];
                    a[L] = a[R];
                    a[R] = temp;
                    if (R == pivot) { // L과 R 원소를 교환하여 결과적으로 pivot 원소의 위치가 변경된 경우
                        for (int t = 0; t < size; t++) {
                            System.out.print(a[t] + " ");
                        }
                        System.out.println();
                        return L; // L은 확정된 pivot의 위치
                    }
                }
            }
            //2. while(L>R)인 경우
            temp = a[pivot];
            a[pivot] = a[R];
            a[R] = temp;
            for (int t = 0; t < size; t++) {
                System.out.print(a[t] + " ");
            }
            System.out.println();
            return R;//R은 확
        }
    
        public static void quickSort(int[] a, int begin, int end) {
            if (begin < end) {
                int p = partition(a, begin, end);
                quickSort(a, begin, p - 1);// pivot의 왼쪽 부분집합에 대해 퀵 정렬 재귀호출
                quickSort(a, p + 1, end);//pivot의 오른쪽 부분집합에 대해 퀵 정렬 재귀호출
            }
        }
    
        public static void main(String[] args) {
            int[] a = {69, 10, 30, 2, 16, 8, 31, 22};
    
            System.out.print("정렬전: ");
            for (int i = 0; i < a.length; i++)
                System.out.print(a[i] + " ");
            System.out.println();
    
            size = a.length;
            quickSort(a, 0, size - 1);
    
            System.out.print("정렬후: ");
            for (int i = 0; i < a.length; i++)
                System.out.print(a[i] + " ");
        }
    }
    ```
    
    > ```java
    > 정렬전: 69 10 30 2 16 8 31 22 
    > 1단계: pivot=2
    > 2 10 30 69 16 8 31 22 
    > 2단계: pivot=16
    > 2 10 8 16 69 30 31 22 
    > 3단계: pivot=10
    > 2 8 10 16 69 30 31 22 
    > 4단계: pivot=30
    > 2 8 10 16 22 30 31 69 
    > 5단계: pivot=31
    > 2 8 10 16 22 30 31 69 
    > 정렬후: 2 8 10 16 22 30 31 69 
    > ```
  
  -----------------
  
  - #### [6. 병합 정렬 ( Merge Sort )](<https://github.com/audtjr9514/BaekJoon_Algorithm/blob/master/src/sort/Sort_6_Merge.java>)
  
    > **정렬된 자료 집합들을 하나로 병합하는 방식으로 정렬**
  
    - **시간 복잡도 : O(n log2n)**
    - **수행 방법**
      
      - **분할-정복 ( Divide-and-Conquer**) 기법의 알고리즘
        - **divide** : 주어진입력원소들을같은크기의2개의부분으로분할
        - **conquer** : 각부분을따로정렬
      - **conquer** : 각부분을따로정렬
      
      - **병합 정렬 방법의 종류**
        - 2-way 병합 : 위와 같이 2개의 정렬된 자료의 집합을 병합
      - k-way 병합 : k개의 정렬된 자료의 집합을 병합
    
    ```JAVA
    static int[] sorted = new int[8];
    
    public static void merge(int a[], int m, int middle, int n) {
        int i = m;             // 첫 번째 부분집합의 시작 위치 설정
        int j = middle + 1;     // 두 번째 부분집합의 시작 위치 설정
        int k = m;             // 배열 sorted에 정렬된 원소를 저장할 위치 설정
    
        while (i <= middle && j <= n) {
            if (a[i] <= a[j]) {
                sorted[k] = a[i];
                i++;
            } else {
                sorted[k] = a[j];
                j++;
            }
            k++;
        }
        if (i > middle)
            for (int t = j; t <= n; t++, k++)
                sorted[k] = a[t];
        else
            for (int t = i; t <= middle; t++, k++)
                sorted[k] = a[t];
        for (int t = m; t <= n; t++)
            a[t] = sorted[t];
        System.out.println("병합 정렬 후: " + Arrays.toString(a));
    }
    
    
    public static void mergeSort(int a[], int m, int n) {
        int middle;
        if (m < n) {
            middle = (m + n) / 2;
            mergeSort(a, m, middle);    // 앞 부분에 대한 분할 작업 수행
            mergeSort(a, middle + 1, n);    // 뒷 부분에 대한 분할 작업 수행
            merge(a, m, middle, n);        // 부분집합에 대하여 정렬과 병합 작업 수행
        }
    }
    ```
    
    > ```java
    > 정렬전: 58 8 28 3 18 6 33 20 
    > -----------------병합 정렬 수행 시작------------------
    > 병합 정렬 후: [8, 58, 28, 3, 18, 6, 33, 20]
    > 병합 정렬 후: [8, 58, 3, 28, 18, 6, 33, 20]
    > 병합 정렬 후: [3, 8, 28, 58, 18, 6, 33, 20]
    > 병합 정렬 후: [3, 8, 28, 58, 6, 18, 33, 20]
    > 병합 정렬 후: [3, 8, 28, 58, 6, 18, 20, 33]
    > 병합 정렬 후: [3, 8, 28, 58, 6, 18, 20, 33]
    > 병합 정렬 후: [3, 6, 8, 18, 20, 28, 33, 58]
    > 정렬후: 3 6 8 18 20 28 33 58 
    > ```
  
  -----------------
  
  - #### [7. 힙 정렬 ( Heap Sort )](<https://github.com/audtjr9514/BaekJoon_Algorithm/blob/master/src/sort/Sort_7_Heap.java>)
  
    >**힙 자료 구조를 이용한 정렬**
    >
    >- **최대 힙에서는 항상 최대 원소가 루트 노드**
    >- **힙에 삭제 연산을 수행하면 항상 최대 원소를 삭제하여 리턴**
    >- **=> 최대 힙에 대해 원소의 개수만큼 삭제 연산을 수행하면 정렬이 이루어짐**
    - **평균 시간 복잡도 : `O(n log2n)`** 
    - **수행 방법**
    1. 정렬할 원소들을 최대 힙으로 구성
          2. 힙에 삭제 연산을 수행하고, 이 때 리턴된 원소를 마지막 자리에 배치
              3. 나머지 원소들을 최대 힙으로 재구성
                  4. 위의 두 단계를 힙 원소가 모두 삭제될 때까지 반복하여 정렬
  
    ```JAVA
    public class Sort_7_Heap {
        private static int[] a;
        private static int number = 10;
    
        public static void heap(int[] a, int number) {
            for (int i = 1; i < number; i++) {
                int child = i;
                while (child > 0) {
                    int parent = (child - 1) / 2;
                    if (a[child] > a[parent]) {
                        int temp = a[parent];
                        a[parent] = a[child];
                        a[child] = temp;
                    }
                    child = parent;
                }
            }
        }
    
        public static void main(String[] args) {
            a = new int[number];
            for (int i = 0; i < number; i++) {
                a[i] = (int) (Math.random() * 100);
            }
            System.out.print("정렬 전 : ");
            for (int i = 0; i < number; i++) {
                System.out.print(a[i] + " ");
            }
            heap(a, number);
            for (int i = number - 1; i > 0; i--) {
                int temp = a[0];
                a[0] = a[i];
                a[i] = temp;
                heap(a, i);
            }
            System.out.print("\n정렬 후 : ");
            for (int i = 0; i < number; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
    ```
  
    > ```java
    > 정렬 전 : 25 66 20 75 0 71 61 42 79 6 
    > 정렬 후 : 0 6 20 25 42 61 66 71 75 79 
    > ```
  
  -----------------
  
  - #### [8. 기수 정렬 ( Radix Sort )](<https://github.com/audtjr9514/BaekJoon_Algorithm/blob/master/src/sort/Sort_8_Radix.java>)
  
    > **원 소 키 값의  기수를 이용한 정렬**
  
    - **평균 시간 복잡도 :`O(d(n+r))`**
    - **수행 방법**
      1. 원소들을 각 원소의 키 값에 해당하는 버켓(Bucket)에 분배하였다가 버켓의 순서대로 원소를 꺼내는 작업을 반복하면서 정렬
      
         - 이런 종류의 기수 정렬을 버켓 정렬이라고도 함
         - 기수 만큼의 버켓이 필요 : 기수가 10이면 10개의 버켓 사용
    
      2. 키 값의 자리수만큼 단계를 반복
      
         1단계 : 키 값의 1의 자리에 따라 버켓에 분배
    
         2단계 : 키 값의 10의 자리에 따라 버켓에 분배
      
         3단계 : 키 값의 100의 자리에 따라 버켓에 분배
      
      3.  한 단계가 끝날때마다 버켓에 분배된 원소들을 버켓의 순서대로 꺼내서 합친 다음 다음 단계를 수행
      
      - 각각의 버켓을 큐로 구현
    
    ```JAVA
    // 배열에서 최대값을 얻기 위한 메서드
    static int getMax(int[] a) {
        int mx = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > mx) {
                mx = a[i];
            }
        }
        return mx;
    }
    
    // exp 변수의 수에 따라 숫자를 정렬
    static void countSort(int[] a, int exp) {
        int[] output = new int[a.length];
        int[] count = new int[10];
        Arrays.fill(count, 0);
    
        // count 값 count배열에 저장
        for (int i = 0; i < a.length; i++) {
            count[(a[i] / exp) % 10]++;
        }
        // count 값이 포함시켜 count배열에 저장
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        // output배열 빌드
        for (int i = a.length - 1; i >= 0; i--) {
            output[count[(a[i] / exp) % 10] - 1] = a[i];
            count[(a[i] / exp) % 10]--;
        }
        // output 배열에 저장된 값을 a 배열에 저장
        for (int i = 0; i < a.length; i++) {
            a[i] = output[i];
        }
    }
    
    static void radixsort(int[] a) {
        // 최대값 찾기
        int m = getMax(a);
        for (int exp = 1; m / exp > 0; exp *= 10) {
            countSort(a, exp);
        }
    }
    ```
    
    > ```java
    > 정렬전: 4 54 2 8 63 7 55 56 
    > 정렬후: 2 4 7 8 54 55 56 63 
    > ```
  
  -----------------
  
  
