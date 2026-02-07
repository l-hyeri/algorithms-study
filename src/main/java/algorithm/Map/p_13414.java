package algorithm.Map;

import java.util.*;
import java.lang.*;
import java.io.*;

public class p_13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < L; i++) {
            String s = br.readLine();
            if (map.containsKey(s)) {
                map.remove(s);
            }
            map.put(s, 0);
        }

        int cnt=0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            sb.append(key).append("\n");
            cnt++;

            if (cnt == K) {
                break;
            }
        }
        System.out.println(sb);
    }
}
