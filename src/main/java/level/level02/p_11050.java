package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_11050 {
    public static void main(String[] args) throws IOException {
        // 팩토리얼 구현 x
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
    }
}