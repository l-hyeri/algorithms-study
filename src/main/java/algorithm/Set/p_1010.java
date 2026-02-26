package algorithm.Set;

import java.util.*;
import java.lang.*;
import java.io.*;

public class p_1010 {
    static int[][] dp = new int[30][30];

    static int cal(int n, int r) {

        if (dp[n][r] > 0) {
            return dp[n][r];
        }

        if (n == r || r == 0) {
            return dp[n][r] = 1;
        }

        return dp[n][r] = cal(n - 1, r - 1) + cal(n - 1, r);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            sb.append(cal(M, N)).append('\n');
        }
        System.out.println(sb);

    }
}
