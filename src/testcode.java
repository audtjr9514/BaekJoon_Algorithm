/* ************************
파일명 : HeapSortTest.java
작성자 : 김명석
작성일 : 20.04.08
내용 : 원과 삼격형의 갯수들을 각각 입력받아 도형 배열로 만들고,
       도형의 면적을 기준으로 힙 정렬(배열을 힙으로 만들고 정렬)하여 출력하는 프로그램
 ************************ */

import java.io.*;
import java.util.StringTokenizer;

class numsortService {
    // 힙정렬
    public static void heapSort(int[] nums) {
        buildHeap(nums); // 배열을 힙으로 만든다.
        int sizeOfHeap = nums.length - 1;
        for (int i = sizeOfHeap; i > 0; i--) {
            swap(nums, 0, i);        // 최대값(루트)와 마지막 노드와 바꾼다.
            sizeOfHeap = sizeOfHeap - 1;    // 최대값을 제외한 힙사이즈
            heapify(nums, 0, sizeOfHeap); // 위의 힙사이즈로 다시 힙 구성
        }
    }

    // 배열을 힙구조로 바꾸는 buildHeap
    public static void buildHeap(int[] nums) {
        for (int i = (nums.length - 1) / 2; i >= 0; i--)
            heapify(nums, i, nums.length - 1);
    }

    // 실제적으로 배열을 힙으로 바꾸는 과정인 heapify
    public static void heapify(int[] nums, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max;

        if (left <= size && nums[left] > nums[i])
            max = left;
        else
            max = i;

        if (right <= size && nums[right] > nums[max])
            max = right;

        if (max != i) {
            swap(nums, i, max);
            heapify(nums, max, size);
        }
        for(int n : nums)
            System.out.print(n +" ");
        System.out.println();

    }

    // 위치를 바꾸는 swap 메소드
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

public class testcode {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] nums = new int[9];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 9; i++)
            nums[i] = Integer.parseInt(st.nextToken());
        numsortService.buildHeap(nums);

        // 각 클래스에 오버라이딩되어있는 toString을 사용하여 배열 내에 있는 각 도형의 정보와 면적을 출력
        bw.newLine();
        bw.write("힙 정렬 결과 " + nums.length + "개의 도형 정보와 면적 = \n");
        for (int n : nums)
            bw.write(n + "\n");
        br.close();
        bw.close();
    }
}