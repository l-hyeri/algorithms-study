package algorithm.Set;

import java.util.*;
import java.io.*;
import java.lang.*;

public class p_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            set.add(s);
        }

        int cnt=0;
        for (int j = 0; j < M; j++) {
            String check = br.readLine();
            if (set.contains(check)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}