package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class p_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0 && C == 0) {
                break;
            } else {
                int[] arr = new int[3];
                arr[0] = A;
                arr[1] = B;
                arr[2] = C;
                Arrays.sort(arr);

                // if (arr[2] * arr[2] == arr[0] * arr[0] + arr[1] * arr[1]) {  // 시간차이 없음.
                if (Math.pow(arr[2], 2) == Math.pow(arr[0], 2) + Math.pow(arr[1], 2)) {
                    sb.append("right" + "\n");
                } else {
                    sb.append("wrong" + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}
