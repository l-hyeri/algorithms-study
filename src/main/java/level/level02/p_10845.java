package level.level02;

import level.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p_10845 {
    // 큐 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Queue<Integer> que = new LinkedList<Integer>();

        int N = Integer.parseInt(br.readLine());
        int end = 0;  // 큐에는 마지막 값을 확인하는 명령어가 없기 때문에 선언

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push":    // push는 offer
                    end = Integer.parseInt(st.nextToken());
                    que.offer(end);
                    break;
                case "front":   // front는 peek
                    if (que.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(que.peek()).append("\n");
                    }
                    break;
                case "back":
                    if (que.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(end).append("\n");
                    }
                    break;
                case "size":    // size는 size
                    sb.append(que.size()).append("\n");
                    break;
                case "empty":   // 비었는지 확인은 isEmpty
                    if (que.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "pop": // pop은 poll
                    if (que.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(que.poll()).append("\n");
                    }
            }
        }
        System.out.println(sb);
    }
}
/**
 * 직접 구현하는 것과 que를 사용하는 것 메모리, 시간 차이 없음.
 *
 * [1] 큐 구현 하는 방법
 * static int[] arr = new int[10001];  // 문제에 주어진 크기만큼 배열 생성
 * static int start = 0;  // 큐는 선입선출이기 때문에 처음 값을 알아야함.
 * static int end = 0;   // 마지막 값
 * <p>
 * public static void main(String[] args) throws IOException {
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * StringTokenizer st;
 * StringBuilder sb = new StringBuilder();
 * <p>
 * int N = Integer.parseInt(br.readLine());
 * <p>
 * for (int i = 0; i < N; i++) {
 * st = new StringTokenizer(br.readLine());
 * String s = st.nextToken();  // 명령어만 읽어들이기
 * <p>
 * switch (s) {
 * case "push":
 * int num = Integer.parseInt(st.nextToken());
 * push(num);
 * break;
 * case "front":
 * sb.append(front()).append("\n");
 * break;
 * case "back":
 * sb.append(back()).append("\n");
 * break;
 * case "size":
 * sb.append(size()).append("\n");
 * break;
 * case "empty":
 * sb.append(empty()).append("\n");
 * break;
 * case "pop":
 * sb.append(pop()).append("\n");
 * break;
 * }
 * }
 * System.out.println(sb);
 * }
 * <p>
 * static void push(int num) {
 * arr[end] = num;
 * end += 1;
 * }
 * <p>
 * static int front() {
 * if (end - start == 0) {
 * return -1;
 * } else {
 * return arr[start];
 * }
 * }
 * <p>
 * static int back() {
 * if (end - start == 0) {
 * return -1;
 * } else {
 * return arr[end - 1];
 * }
 * }
 * <p>
 * static int size() {
 * return end - start;
 * }
 * <p>
 * static int empty() {
 * if (end - start == 0) {
 * return 1;
 * } else {
 * return 0;
 * }
 * }
 * <p>
 * static int pop() {
 * if (end - start == 0) {
 * return -1;
 * } else {
 * int presult = arr[start];
 * start += 1;
 * return presult;
 * }
 * }
 */