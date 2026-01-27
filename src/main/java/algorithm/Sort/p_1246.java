package algorithm.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p_1246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[M + 1];
        for (int i = 1; i <= M; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int cost = 0;
        int sum = 0;
        for (int i = 1; i <= M; i++) {
            int tmp_c = arr[i];
            int tmp_s = tmp_c * (M - i + 1);

            if (tmp_s > sum && M - i + 1 <= N) {
                sum = tmp_s;
                cost = tmp_c;
            }
        }
        System.out.println(cost + " " + sum);
    }
}
