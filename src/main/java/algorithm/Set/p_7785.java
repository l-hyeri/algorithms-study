package algorithm.Set;

import java.util.*;
import java.lang.*;
import java.io.*;

public class p_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        TreeSet<String> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String note = st.nextToken();

            if (note.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        for (String name : set) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}
/*
// HashMap을 사용하는 방법
 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String note = st.nextToken();

            map.putIfAbsent(name, new ArrayList<>());
            map.get(name).add(note);
        }

        List<String> result = new LinkedList<>();

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();

            int check = 0;
            for (String s : value) {
                if (s.equals("enter")) {
                    check += 1;
                } else {
                    check -= 1;
                }
            }

            if (check != 0) {
                result.add(key);
            }
        }

        Collections.sort(result, (a, b) -> b.compareTo(a));
        for (String name : result) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
* */