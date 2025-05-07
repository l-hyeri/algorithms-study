package algorithm.BFSandDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_1743 {
    static int[][] graph;
    static int N, M;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int cnt = 0;

    static int DFS(int x, int y, int[][] graph) {
        graph[x][y] = 0;
        cnt += 1;
        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cx <= N && cy >= 0 && cy <= M && graph[cx][cy] == 1) {
                DFS(cx, cy, graph);
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int result = 0;

        graph = new int[N + 1][M + 1];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = 1;
        }

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M; j++) {
                cnt = 0;
                if (graph[i][j] == 1) {
                    result = Math.max(result, DFS(i, j, graph));
                }
            }
        }
        System.out.println(result);
    }
}
