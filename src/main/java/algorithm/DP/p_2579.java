package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_2579 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stair = new int[N + 1];
        int[] dp = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            System.out.println(stair[1]);
            return;
        }

        dp[1] = stair[1];
        dp[2] = stair[1] + stair[2];

        if (N >= 3) {
            dp[3] = Math.max(stair[1] + stair[3], stair[2] + stair[3]);
        }

        for (int i = 4; i <= N; i++) {
            dp[i] = Math.max(dp[i - 2] + stair[i], dp[i - 3] + stair[i - 1] + stair[i]);
        }

        System.out.println(dp[N]);
    }
}
