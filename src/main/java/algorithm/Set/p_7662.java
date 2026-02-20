package algorithm.Set;

import java.io.*;
import java.util.*;
import java.lang.*;

public class p_7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());

            TreeMap<Integer, Integer> map = new TreeMap<>();

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());

                String s = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                if (s.equals("I")) {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                } else if (s.equals("D") && !map.isEmpty() && num == 1) {
                    int key = map.lastKey();
                    int cnt = map.get(key);

                    if (cnt == 1) {
                        map.remove(key);
                    } else {
                        map.put(key, cnt - 1);
                    }

                } else if (s.equals("D") && !map.isEmpty() && num == -1) {
                    int key = map.firstKey();
                    int cnt = map.get(key);

                    if (cnt == 1) {
                        map.remove(key);
                    } else {
                        map.put(key, cnt - 1);
                    }
                }
            }

            if (map.size() == 0) {
                sb.append("EMPTY").append("\n");
            } else {
                sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
            }
        }
        System.out.println(sb);
    }
}