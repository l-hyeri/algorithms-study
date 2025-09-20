package algorithm.BFSandDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p_16953 {

    private static long A;
    private static long B;

    private static int BFS() {
        Queue<long[]> q = new LinkedList<>();
        Map<Long, Integer> map = new HashMap<>();

        q.offer(new long[]{A, 1});
        map.put(A, 1);

        while (!q.isEmpty()) {
            long[] num = q.poll();
            long tmp = num[0]; // 현재 숫자
            int cnt = (int)num[1];  // 현재 숫자의 연산 횟수

            if (tmp == B) {
                return cnt;
            }

            long tmp1 = tmp * 2;
            long tmp2 = tmp * 10 + 1;

            if (tmp1 <= B && !map.containsKey(tmp1)) {
                q.offer(new long[]{tmp1, cnt + 1});
                map.put(tmp1, cnt + 1);
            }

            if (tmp2 <= B&&!map.containsKey(tmp2)) {
                q.offer(new long[]{tmp2,cnt+1});
                map.put(tmp2, cnt + 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        System.out.println(BFS());
    }
}
