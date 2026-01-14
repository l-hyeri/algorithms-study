package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_17074 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int b_check = -1;  // 정렬이 깨지는 인덱스 지점
        int cnt = 0;  // 정렬이 깨지는 개수
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                b_check = i;
                cnt++;
            }
        }

        if (cnt == 0) { // 이미 정렬이 모두 다 된 경우
            System.out.println(N);
            return;
        }

        if (cnt >= 2) {
            System.out.println(0);
            return;
        }

        int answer=0;
        if (b_check == 0 || arr[b_check - 1] <= arr[b_check + 1]) {
            answer++;
        }

        if (b_check + 1 == N - 1 || arr[b_check] <= arr[b_check + 2]) {
            answer++;
        }

        System.out.println(answer);

    }
}
