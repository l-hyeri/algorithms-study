package algorithm.Map;

import java.util.*;
import java.lang.*;
import java.io.*;

public class p_1302 {
    // 효율적으로 수정한 코드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String title = br.readLine();
            map.put(title, map.getOrDefault(title, 0) + 1);
        }

        int result_cnt = 0;
        String result = "";

        /*
        for (String s : map.keySet()) {
        int cnt = map.get(s);
        * */
        // keySet()을 수행한 후 get을 하면 map내부에서 s에 해당하는 값을 찾기 위해 다시 탐색이 일어남
        // keySet() + get() -> entrySet()
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String s = entry.getKey();
            int cnt = entry.getValue();

            /*
            if (cnt > result_cnt) {
                result_cnt = cnt;
                result = s;
            } else if (cnt == result_cnt) {
                if (s.compareTo(result) < 0) {
                    result = s;
                }
            }
            * */

            //if 부분과 else if 부분이 만족하면 둘 다 result=s를 수행하기 떄문에 하나로 합침.
            if (cnt > result_cnt || (cnt == result_cnt && s.compareTo(result) < 0)) {
                result_cnt = cnt;
                result = s;
            }
        }
        System.out.println(result);
    }
}
/*
// 제출 코드
  public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String title = br.readLine();

            if (map.containsKey(title)) {   // true인 경우
                int value = map.get(title);
                map.put(title, value + 1);

            } else {
                map.putIfAbsent(title, 1);  // 없을 때
            }
        }

        int result_cnt = Integer.MIN_VALUE;
        String result = "";
        for (String s : map.keySet()) {
            int cnt = map.get(s);

            if (cnt > result_cnt) {
                result_cnt = cnt;
                result = s;
            } else if (cnt == result_cnt) {
                if (s.compareTo(result) < 0) {
                    result = s;
                }
            }
        }

        System.out.println(result);
    }
* */