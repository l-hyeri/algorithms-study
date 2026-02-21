package algorithm.Map;

import java.util.*;
import java.lang.*;
import java.io.*;

public class p_25325 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            map.put(st.nextToken(), 0);
        }

        for (int j = 0; j < N; j++) {
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                String name = st.nextToken();
                int cnt = map.get(name);
                map.replace(name, cnt + 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((o1,o2)-> {
            if (!o1.getValue().equals(o2.getValue())) {
                return o2.getValue() - o1.getValue();
            }
            return o1.getKey().compareTo(o2.getKey());
        });

        for (Map.Entry<String, Integer> entry : list) {
            sb.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
        }
        System.out.println(sb);
    }
}
