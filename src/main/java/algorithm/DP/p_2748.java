package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p_2748 {
    // [Top down 방식]
    private static long Fibo(long[] dp, int n){
        if (n <= 1) {
            return dp[n] = n;   // dp[0]=0 , dp[1]=1
        }

        if (dp[n] != 0) {
            return dp[n];   // 메모리제이션 -> 이미 값이 저장되어 있으면 계산 x
        }
        dp[n] = Fibo(dp, n - 1) + Fibo(dp, n - 2);

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[n + 1];

        System.out.println(Fibo(dp, n));
    }
}

/* [Bottom up 방식]
    static long[] dp = new long[91];

    private static long factorial(int N) {
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[N];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(factorial(N));
    }
* */
