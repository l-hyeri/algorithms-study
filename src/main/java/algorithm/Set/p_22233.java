package algorithm.Set;

import java.util.*;
import java.io.*;
import java.lang.*;

public class p_22233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String keyword = br.readLine();
            set.add(keyword);
        }

        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine(), ",");
            while (st.hasMoreTokens()) {
                set.remove(st.nextToken());
            }
            sb.append(set.size()).append("\n");
        }
        System.out.println(sb);
    }
}