package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_2609 {
//    static int GCD(int n1, int n2) {    // 재귀방식
//        if (n2 == 0) {
//            return n1;
//        }
//        return GCD(n2, n1 % n2);
//    }

    static int GCD(int n1, int n2) {    // 반복문
        while (n2 != 0) {
            int tmp = n1 % n2;
            n1 = n2;
            n2 = tmp;
        }
        return n1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        int result = GCD(n1, n2);
        System.out.println(result);
        System.out.println(n1 * n2 / result);
    }
}
/**
 * [GCD 알고리즘 -> 최대공약수 알고리즘 -> 유클리드 호제법]
 * 숫자 a, b, r (r은 a에 b를 나눈 나머지)
 * GCD(a,b) = GCD(b,r) 성립
 * <p>
 * ex) GCD(581,322) -> r=259
 * GCD(581,322) = GCD(322,259) -> r=63
 * GCD(581,322) = GCD(322,259) = GCD(259,63) -> r=7
 * GCD(581,322) = GCD(322,259) = GCD(259,63) = GCD(63,7) -> r=0
 * GCD(581,322) = GCD(322,259) = GCD(259,63) = GCD(63,7) = GCD(7,0)
 */
