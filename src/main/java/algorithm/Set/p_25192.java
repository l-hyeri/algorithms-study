package algorithm.Set;

import java.util.*;
import java.lang.*;
import java.io.*;

public class p_25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        int cnt=0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            if (s.equals("ENTER")) {
                set.clear();
                continue;
            }

            if (!set.contains(s)) {
                set.add(s);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}