package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());    // 참가자 수
        int[] size = new int[6];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int tcount = 0; // 티 묶음 수
/**
 * for (int i = 0; i < 6; i++) {
 *             if (size[i] != 0) {
 *                 if (T < size[i]) {
 *                     if (size[i] % T == 0) {
 *                         tcount += size[i] / T;
 *                     } else {
 *                         tcount += ((size[i] / T) + 1);
 *                     }
 *                 } else {
 *                     tcount += 1;
 *                 }
 *             }
 *         }
 * */

        for (int i = 0; i < 6; i++) {
            tcount += size[i] / T;
            if (size[i] % T > 0) {
                tcount += 1;
            }
        }

        System.out.println(tcount);
        System.out.println(N / P + " " + N % P);
    }
}
/**
 * 티셔츠 S, M, L XL, XXL, XXXL
 * 같은 사이즈의 T장 묶음으로만 주문 가능
 * -> 남아도 O, 부족 X
 * <p>
 * 펜 P자루씩 묶음으로 주문 or 한 자루씩 주문 가능
 * -> 남거나 부족 X
 */
