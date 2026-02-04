package algorithm.Implementation;

import java.util.*;
import java.io.*;
import java.lang.*;

public class p_1969 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());   // DNA 개수
        int M = Integer.parseInt(st.nextToken());   // DNA 길이

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i]=br.readLine();
        }

        int total=0;

        for (int j = 0; j < M; j++) {
            int[] cnt = new int[4];

            for (int k = 0; k < N; k++) {
                char c = arr[k].charAt(j);

                if (c == 'A') {
                    cnt[0]++;
                } else if (c == 'C') {
                    cnt[1]++;
                } else if (c == 'G') {
                    cnt[2]++;
                } else if (c == 'T') {
                    cnt[3]++;
                }
            }

            int max = 0;
            int c=0;
            for (int m = 0; m < 4; m++) {
                if (cnt[m] > max) {
                    max = cnt[m];
                    c = m;
                }
            }

            char[] dnaChar = {'A', 'C', 'G', 'T'};
            sb.append(dnaChar[c]);

            total += (N - max);
        }
        System.out.println(sb);
        System.out.println(total);
    }
}