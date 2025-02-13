package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_11050 {
    static int[][] dp;

    static int BC(int n, int k) {  // dp를 하지 않으면 성능이 떨어짐. -> 배열 선언으로 해결
        if (n == k || k == 0) {
            return 1;
        }
        return dp[n][k] = BC(n - 1, k - 1) + BC(n - 1, k);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        dp = new int[n + 1][k + 1];
        System.out.println(BC(n, k));

    }
}
// nCr = n! / r!(n-r)!
// 파스칼 법칙 : nCr = n-1Cr-1 + n-1Cr
// nC0 = nCn = 1
/*
 // [1] 팩토리얼 구현 x
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int tmp = 1;
        int cnt = 1;

        for (int i = 0; i < k; i++) {
            tmp *= (n - i);
            cnt *= i + 1;
        }

        System.out.println(tmp / cnt);
* */

/*
 // [2] 팩토리얼 구현 -> [1], [2] 시간 차이 없음.
     static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(factorial(n) / (factorial(k) * factorial(n - k)));
    }
* */