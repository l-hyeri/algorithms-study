package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_14916 {

    public static int sol(int n){
        int cnt=0;

        while (n >= 0) {
            if (n % 5 == 0) {
                cnt += n / 5;
                return cnt;
            }
            n-=2;
            cnt+=1;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(sol(n));
    }
}
