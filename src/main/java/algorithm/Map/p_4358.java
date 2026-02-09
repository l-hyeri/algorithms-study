package algorithm.Map;

import java.util.*;
import java.io.*;
import java.lang.*;

public class p_4358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Double> map = new TreeMap<>();

        String tree;
        long cnt=0;
        while ((tree=br.readLine())!=null) {
            map.put(tree, map.getOrDefault(tree, 0.0) + 1);
            cnt++;
        }

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            String key = entry.getKey();
            double value = entry.getValue();

            String cal = String.format("%.4f",(value / cnt) * 100);
            sb.append(key).append(" ").append(cal).append("\n");
        }
        System.out.println(sb);
    }
}