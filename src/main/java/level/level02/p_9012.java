package level.level02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Stack;

public class p_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            Stack<String> stack = new Stack<String>();
            int left = 0;
            int right = 0;

            for (int j = 0; j < s.length(); j++) {
                String check = String.valueOf(s.charAt(j));
                stack.add(check);
                if (check.equals(")")) {
                    if (left > 0) {
                        stack.pop();
                        stack.pop();
                        left -= 1;
                    } else {
                        right += 1;
                    }
                } else {
                    left += 1;
                }
            }

            if (stack.isEmpty()) {
                sb.append("YES" + "\n");
            } else {
                sb.append("NO" + "\n");
            }
        }
        System.out.println(sb);
    }
}
