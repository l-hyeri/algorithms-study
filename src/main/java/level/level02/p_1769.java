package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();

        int cnt=0;
        while (true) {
            int sum=0;
            if (x.length() == 1) {
                break;
            }

            for (int i = 0; i < x.length(); i++) {
                sum += Integer.parseInt(String.valueOf(x.charAt(i)));
            }
            cnt+=1;
            x = String.valueOf(sum);
        }

        if (Integer.parseInt(x) % 3 == 0) {
            System.out.println(cnt);
            System.out.println("YES");
        } else {
            System.out.println(cnt);
            System.out.println("NO");
        }
    }
}
/*  시간 초과
static int calculate(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        if (sum > 10) {
            return calculate(sum);
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int result = calculate(x);

        if (result % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
* */
