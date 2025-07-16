package algorithm.BFSandDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p_16930 {
    static int[] dx = {1, 0, -1, 0};  // 하, 좌, 상, 우
    static int[] dy = {0, -1, 0, 1};

    private static void BFS(String[][] board, int[][] visit, int N, int M, int K, int x1, int y1, int x2, int y2) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x1, y1});
        visit[x1][y1] = 1;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] c = q.poll();
                int cx = c[0];
                int cy = c[1];

                for (int j = 0; j < 4; j++) {
                    for (int step = 1; step <= K; step++) {
                        int nx = cx + dx[j] * step;
                        int ny = cy + dy[j] * step;

                        if (nx < 1 || nx > N || ny < 1 || ny > M) break;

                        if (board[nx][ny].equals("#")) break;

                        if (visit[nx][ny] != 0) {
                            if (visit[nx][ny] < visit[cx][cy] + 1) break;
                            if (visit[nx][ny] == visit[cx][cy] + 1) continue;
                        }

                        q.offer(new int[]{nx, ny});
                        visit[nx][ny] = visit[cx][cy] + 1;

                        if (nx == x2 && ny == y2) {
                            System.out.println(visit[nx][ny] - 1);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        String[][] board = new String[N + 1][M + 1];
        int[][] visit = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            String s = br.readLine();
            for (int j = 1; j <= M; j++) {
                board[i][j] = String.valueOf(s.charAt(j - 1));
            }
        }

        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        BFS(board, visit, N, M, K, x1, y1, x2, y2);
    }
}
