package algorithm.Map;

import java.util.*;
import java.io.*;
import java.lang.*;

public class p_20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>(); // 자주 나오는 단어

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            int length = word.length();

            if (M <= length) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        List<String> word_list = new ArrayList<>(map.keySet());

        word_list.sort((o1,o2)->{

            if (Integer.compare(map.get(o1), map.get(o2)) > 0) {
                return -1;
            } else if (Integer.compare(map.get(o1), map.get(o2)) < 0) {
                return 1;
            }

            if (o1.length() > o2.length()) {
                return -1;
            } else if (o1.length() < o2.length()) {
                return 1;
            }

            return o1.compareTo(o2);
        });

        for (String s : word_list) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}