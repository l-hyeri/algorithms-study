package level.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p_10818 {
    public static void main(String[] args) throws IOException {
        /** [1] 메모리 : 92328 , 시간 : 452
         *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         *
         *         int N = Integer.parseInt(br.readLine());
         *         int arr[] = new int[N];
         *
         *         StringTokenizer st = new StringTokenizer(br.readLine());
         *         for (int i = 0; i < N; i++) {
         *             arr[i] = Integer.parseInt(st.nextToken());
         *         }
         *
         *         int min = arr[0];
         *         int max = arr[0];
         *
         *         for (int i = 0; i < N; i++) {
         *             if (arr[i] < min) {
         *                 min = arr[i];
         *             } else if (max < arr[i]) {
         *                 max = arr[i];
         *             }
         *         }
         *
         *         System.out.println(min + " " + max);
         * */

        // [2] 메모리 : 113056 , 시간 : 1340
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N - 1]);
    }
}
/**
 * 20 10 35 30 7
 * min=20 , max=20
 * 반복 -> min보다 현재 숫자가 작으면 -> 현재 숫자를 min
 * -> max보다 현재 숫자가 크면 -> 현재 숫자를 max
 */
