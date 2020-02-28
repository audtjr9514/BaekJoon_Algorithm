//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.IOException;
//import java.util.StringTokenizer;
//
//public class bj_15649 {
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//    public static void main(String[] args) throws IOException {
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//
//        int[] output = new int[n];
//        boolean[] visited = new boolean[n];
//
//        perm(arr, output, visited, 0, n, m);
//        System.out.println();
//        permutation(arr, 0, n, m);
//    }
//
//    // 순서를 지키면서 n 개중에서 r 개를 뽑는 경우
//    // 사용 예시: perm(arr, output, visited, 0, n, 3);
//    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) throws IOException {
//        if (depth == r) {
//            print(output, r);
//            return;
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (visited[i] != true) {
//                visited[i] = true;
//                output[depth] = arr[i];
//                perm(arr, output, visited, depth + 1, n, r);
//                output[depth] = 0; // 이 줄은 없어도 됨
//                visited[i] = false;
//
//            }
//        }
//    }
//
//    // 순서 없이 n 개중에서 r 개를 뽑는 경우
//    // 사용 예시: permutation(arr, 0, n, 4);
//    static void permutation(int[] arr, int depth, int n, int r) throws IOException {
//        if (depth == r) {
//            print(arr, r);
//            return;
//        }
//
//        for (int i = depth; i < n; i++) {
//            swap(arr, depth, i);
//            permutation(arr, depth + 1, n, r);
//            swap(arr, depth, i);
//        }
//    }
//
//    static void swap(int[] arr, int depth, int i) {
//        int temp = arr[depth];
//        arr[depth] = arr[i];
//        arr[i] = temp;
//    }
//
//    // 배열 출력
//    static void print(int[] arr, int r) throws IOException {
//        for (int i = 0; i < r; i++)
//            bw.write(String.valueOf(arr[i]) + " ");
//        bw.newLine();
//    }
//}

import java.util.*;

/*
 * 순열 : n 개 중에서 r 개 선택
 * 시간복잡도는 O(n!)
 * 연습문제 : https://www.acmicpc.net/problem/10974
 */

public class bj_15649 {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1, 2, 3};
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

        perm(arr, output, visited, 0, n, 3);
        System.out.println();
        permutation(arr, 0, n, 3);
    }

    // 순서를 지키면서 n 개중에서 r 개를 뽑는 경우
// 사용 예시: perm(arr, output, visited, 0, n, 3);
    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            print(output, r);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                output[depth] = 0; // 이 줄은 없어도 됨
                visited[i] = false;
                ;
            }
        }
    }

    // 순서 없이 n 개중에서 r 개를 뽑는 경우
// 사용 예시: permutation(arr, 0, n, 4);
    static void permutation(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            print(arr, r);
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    // 배열 출력
    static void print(int[] arr, int r) {
        for (int i = 0; i < r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
