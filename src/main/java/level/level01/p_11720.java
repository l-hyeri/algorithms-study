package level.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_11720 {
    public static void main(String[] args) throws IOException {
        /** [1] 문자열을 읽어서 배열에 저장 후 int로 바꿔서 값 출력
         *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         *
         *         int N = Integer.parseInt(br.readLine());
         *         String arr[] = br.readLine().split("");
         *
         *         int result = 0;
         *         for (int i = 0; i < N; i++) {
         *             result += Integer.parseInt(arr[i]);
         *         }
         *
         *         System.out.println(result);
         * */

        // [2] 문자열을 읽어서 charAt(i)-48로 바로 숫자로 변환하는 방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += s.charAt(i) - 48;
        }
        System.out.println(result);
    }
}
