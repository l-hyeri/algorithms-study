package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1259 {
    // true, false로 확인하는 방식 : 둘 다 시간은 비슷함.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String num = null;

        while (true) {
            boolean result = true;
            num = br.readLine();

            if (num.equals("0")) {
                break;
            }

            for (int i = 0; i < num.length() / 2; i++) {
                if (num.charAt(i) != num.charAt(num.length() - i - 1)) {
                    result = false;
                }
            }

            if (result) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb);
    }
}
/* 횟수를 카운트 하는 방식
*  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = null;

        while (true) {
            int cnt = 0;
            num = br.readLine();

            if (num.equals("0")) {
                break;
            }

            for (int i = 0; i < num.length()/2; i++) {
                if (num.charAt(i) != num.charAt(num.length() - i - 1)) {
                    System.out.println("no");
                    break;
                }
                cnt+=1;
            }

            if (num.length() / 2 == cnt) {
                System.out.println("yes");
            }
        }
* */
