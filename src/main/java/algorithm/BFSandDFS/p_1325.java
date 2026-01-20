package algorithm.BFSandDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p_1325 {
    private static ArrayList<ArrayList<Integer>> arr;
    private static int N;
    private static int M;

    private static int BFS(int i) {
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visit = new boolean[N + 1];
        q.offer(i);
        visit[i]=true;

        int cnt=1;
        while (!q.isEmpty()) {
            int current = q.poll();
            for (int tmp : arr.get(current)) {
                if (!visit[tmp]) {
                    visit[tmp] = true;
                    q.offer(tmp);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.get(b).add(a);
        }

        int[] result = new int[N + 1];
        int maxCnt=0;
        for (int i = 1; i <= N; i++) {
            int cnt=BFS(i);
            result[i] = cnt;
            maxCnt = Math.max(cnt, maxCnt);
        }

        for (int i = 1; i <= N; i++) {
            if (result[i] == maxCnt) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }
}
