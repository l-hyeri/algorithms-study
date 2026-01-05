package algorithm.Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_1057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int Kim_num = Integer.parseInt(st.nextToken());
        int Im_num = Integer.parseInt(st.nextToken());

        int round = 0;
        while (Kim_num != Im_num) {
            Kim_num = (Kim_num + 1) / 2;
            Im_num = (Im_num + 1) / 2;
            round++;
        }
        System.out.println(round);
    }
}
/* [초기 코드]
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int Kim_num = Integer.parseInt(st.nextToken());
        int Im_num = Integer.parseInt(st.nextToken());

        int round = 0;
        int cnt = 0;
        while (true) {
            round += 1;
            for (int i = 1; i <= N; i += 2) {
                cnt += 1;
                if ((i == Kim_num && i + 1 == Im_num) || (i == Im_num && i + 1 == Kim_num)) {
                    System.out.println(round);
                    return;
                } else if (i == Kim_num || i + 1 == Kim_num) {
                    Kim_num = cnt;
                } else if (i == Im_num || i + 1 == Im_num) {
                    Im_num = cnt;
                }
            }
            N = cnt;
            cnt = 0;
        }

* */
