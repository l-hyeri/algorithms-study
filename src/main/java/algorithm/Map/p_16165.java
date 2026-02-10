package algorithm.Map;

import java.util.*;
import java.lang.*;
import java.io.*;

public class p_16165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, TreeSet<String>> groupMap = new HashMap<>(); // 그룹 이름으로 멤버 목록 찾기
        Map<String, String> memberMap = new HashMap<>();    // 멤버 이름으로 그룹 이름 찾기
        for (int i = 0; i < N; i++) {
            String group_name = br.readLine();
            int member_cnt = Integer.parseInt(br.readLine());

            TreeSet<String> n = new TreeSet<>();
            for (int j = 0; j < member_cnt; j++) {
                String name = br.readLine();
                n.add(name);
                memberMap.put(name, group_name);
            }
            groupMap.put(group_name, n);
        }

        for (int m = 0; m < M; m++) {
            String quiz = br.readLine();
            int sorting = Integer.parseInt(br.readLine());

            if (sorting == 1) {
                String team = memberMap.get(quiz);
                sb.append(team).append("\n");
            } else {
                TreeSet<String> value = groupMap.get(quiz);
                for (String v : value) {
                    sb.append(v).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}