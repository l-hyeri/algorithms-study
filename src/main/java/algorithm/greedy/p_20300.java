package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p_20300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        long[] arr= new long[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);
        long max = 0;
        long result=0;

        for (int i = 0; i < N / 2; i++) {
            if (N % 2 != 0) {
                max = arr[i] + arr[N - i - 2];
            } else {
                max = arr[i] + arr[N - i - 1];  // 가장 앞과 가장 뒤 값 더함
            }
            result = Math.max(result, max);
        }

        System.out.println(result);
    }
}
