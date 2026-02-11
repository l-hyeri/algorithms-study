package algorithm.Map;

import java.util.*;
import java.lang.*;
import java.io.*;

public class p_20291 {
    // 효율적으로 수정한 코드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String hName = s.substring(s.lastIndexOf('.') + 1);

            map.put(hName, map.getOrDefault(hName, 0) + 1);
        }

        TreeMap<String, Integer> sortMap = new TreeMap<>(map);

        for (Map.Entry<String, Integer> entry : sortMap.entrySet()) {
            sb.append(entry.getKey())
                    .append(" ")
                    .append(entry.getValue())
                    .append("\n");
        }
        System.out.println(sb);
    }
}
/**
 * // 처음 제출한 코드
 * public static void main(String[] args) throws IOException {
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * StringTokenizer st;
 * StringBuilder sb = new StringBuilder();
 * <p>
 * int N = Integer.parseInt(br.readLine());
 * Map<String, Integer> map = new TreeMap<>();
 * for (int i = 0; i < N; i++) {
 * st = new StringTokenizer(br.readLine(), ".");
 * String fileName = st.nextToken();
 * String hName = st.nextToken();    // 확장자 이름
 * <p>
 * map.put(hName,map.getOrDefault(hName,0)+1);
 * }
 * <p>
 * for (Map.Entry<String, Integer> entry : map.entrySet()) {
 * String key=entry.getKey();
 * int value=entry.getValue();
 * <p>
 * sb.append(key).append(" ").append(value).append("\n");
 * }
 * System.out.println(sb);
 * }
 */