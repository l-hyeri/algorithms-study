package algorithm.BFSandDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p_1326 {
    private static int N;
    private static int[] arr;


    private static int BFS(int a, int b) {
        Queue<int[]> q = new LinkedList<>();
        boolean[] visit = new boolean[N + 1];
        q.offer(new int[]{a, 0});
        visit[a] = true;

        while (!q.isEmpty()) {
            int[] tmp_arr = q.poll();
            int index = tmp_arr[0];
            int distance = tmp_arr[1];

            if (index == b) {
                return distance;
            }

            int tmp = arr[index];
            for (int i = index + tmp; i <= N; i += tmp) {
                if (!visit[i]) {
                    visit[i] = true;
                    q.offer(new int[]{i, distance + 1});
                }
            }

            for (int i = index - tmp; i >= 1; i -= tmp) {
                if (!visit[i]) {
                    visit[i] = true;
                    q.offer(new int[]{i, distance + 1});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(BFS(a, b));
    }
}
