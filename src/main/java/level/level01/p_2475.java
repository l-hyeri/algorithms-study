package level.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class p_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(st.nextToken());
            result += num * num;
        }
        result %= 10;
        System.out.println(result);
    }
}
