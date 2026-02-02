package algorithm.Map;

import java.io.*;
import java.util.*;
import java.lang.*;

public class p_1620 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> name_map = new HashMap<>();
        Map<Integer, String> num_map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String name=br.readLine();
            name_map.put(name,i+1);
            num_map.put(i + 1, name);
        }

        for (int j = 0; j < M; j++) {
            String question = br.readLine();
            char check = question.charAt(0);
            if (Character.isDigit(check) == false) {    // 숫자가 아닌 경우
                sb.append(name_map.get(question)).append("\n");
            } else {    // 숫자인 경우
                int number = Integer.parseInt(question);
                sb.append(num_map.get(number)).append("\n");
            }
        }
        System.out.println(sb);
    }
}