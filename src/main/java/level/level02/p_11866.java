package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> que = new LinkedList<Integer>();

        for (int i = 0; i < N; i++) {
            que.add(i + 1);
        }

        int cnt = 1;
        sb.append("<");
        while (que.isEmpty() != true) {
            if (cnt == K) {
                if (que.size() == 1) {
                    sb.append(que.poll()+">");
                } else {
                    sb.append(que.poll() + ", ");
                }
                cnt = 1;
            } else {
                que.add(que.poll());
                cnt += 1;
            }
        }
        System.out.println(sb);
    }
}