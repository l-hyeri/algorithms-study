package level.level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1003 {
    static Integer dp[][] = new Integer[41][2];

    static Integer[] fibonacci(int num) {
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        if (dp[num][0] == null || dp[num][1] == null) {
            dp[num][0] = fibonacci(num-1)[0] +  fibonacci(num-2)[0];
            dp[num][1] = fibonacci(num-1)[1] + fibonacci(num-2)[1];
        }
        return dp[num];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(dp[N][0]).append(" ").append(dp[N][1]).append("\n");
        }
        System.out.println(sb);
    }
}
