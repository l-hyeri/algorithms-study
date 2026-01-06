package algorithm.Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        int end_num = N % 100;
        int num = N - end_num;

        for (int i = 0; i < 100; i++) {
            int tmp = num + i;

            if (tmp % F == 0) {
                System.out.println(String.format("%02d", i));
                break;
            }
        }
    }
}
