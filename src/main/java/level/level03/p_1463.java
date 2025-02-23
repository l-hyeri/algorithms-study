package level.level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1463 {
    // [1] 하향식 사용
    static Integer[] dp;

    static int calculate(int n) {   // +1을 하는 이유는 현재 계산된 것도 count해야함.
        if (dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(calculate(n - 1), Math.min(calculate(n / 3), calculate(n / 2))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(calculate(n / 3), calculate(n - 1)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(calculate(n / 2), calculate(n - 1)) + 1;

            } else {
                dp[n] = calculate(n - 1) + 1;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N + 1];  // N값을 받고 난 후 dp 배열 생성
        dp[0] = 0;
        dp[1] = 0;

        System.out.println(calculate(N));
    }
}