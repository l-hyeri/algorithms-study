package algorithm.Implementation;

import java.io.*;
import java.lang.*;
import java.util.*;

public class p_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];

        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int n = i; n <= j; n++) {
                arr[n] = k;
            }
        }

        for(int i=1;i<=N;i++){
            sb.append(arr[i]+" ");
        }
        System.out.println(sb);
    }
}