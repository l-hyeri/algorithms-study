package algorithm.Map;

import java.util.*;
import java.io.*;
import java.lang.*;

public class p_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int calculate=1;

            Map<String, List<String>> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String sort = st.nextToken();

                if (!map.containsKey(sort)) {
                    map.put(sort, new ArrayList<>());
                }
                map.get(sort).add(name);
            }

            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                List<String> value=entry.getValue();
                calculate *= (value.size() + 1);
            }

            sb.append(calculate - 1).append("\n");
        }
        System.out.println(sb);
    }
}
