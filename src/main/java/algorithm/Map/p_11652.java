package algorithm.Map;

import java.io.*;
import java.util.*;
import java.lang.*;

public class p_11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        TreeMap<Long, Integer> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        long result = 0;
        int count = 0;
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            int value = entry.getValue();

            if (count == 0 || count < value) {
                result = entry.getKey();
                count = value;
            }
        }

        System.out.println(result);
    }
}