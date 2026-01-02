package algorithm.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int tmp = 1;
            for (int j = 0; j < b; j++) {
                tmp *= a;
                tmp %= 10;
            }

            if (tmp == 0) {
                System.out.println(10);
            } else {
                System.out.println(tmp);
            }
        }
    }
}