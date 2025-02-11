package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class p_10828 {
    // stack 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<Integer>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}

/**
 * [1] 스택 직접 구현
 * static int[] arr = new int[10001];
 * static int last = 0;   // 가장 위에 있는 값을 확인하기 위함
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
 * String s = st.nextToken();
 * <p>
 * switch (s) {
 * case "push":
 * int num = Integer.parseInt(st.nextToken());
 * push(num);
 * break;
 * case "top":
 * sb.append(top()).append("\n");
 * break;
 * case "size":
 * sb.append(last).append("\n");
 * break;
 * case "empty":
 * sb.append(size()).append("\n");
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
 * arr[last] = num;
 * last += 1;
 * }
 * <p>
 * static int top() {
 * if (last == 0) {
 * return -1;
 * } else {
 * return arr[last - 1];
 * }
 * }
 * <p>
 * static int size() {
 * if (last == 0) {
 * return 1;
 * } else {
 * return 0;
 * }
 * }
 * <p>
 * static int pop() {
 * if (last == 0) {
 * return -1;
 * } else {
 * int presult = arr[last - 1];
 * last -= 1;
 * return presult;
 * }
 * }
 */
