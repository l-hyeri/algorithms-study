package algorithm.BFSandDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_1743 {
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, -1, 0, 1};

    private static void Sol(int[][] board, boolean[][] visit, int N, int M) {
        int result = 0;
        int tmp = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (board[i][j] == 1 && !visit[i][j]) {
                    tmp = DFS(board, visit, N, M, i, j);
                }
                if (result < tmp) {
                    result = tmp;
                }
            }
        }
        System.out.println(result);
    }

    private static int DFS(int[][] board, boolean[][] visit, int N, int M, int i, int j) {
        int cnt = 1;
        visit[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int cx = i + dx[k];
            int cy = j + dy[k];

            if (cx >= 1 && cx <= N && cy >= 1 && cy <= M && board[cx][cy] == 1 && !visit[cx][cy]) {
                cnt += DFS(board, visit, N, M, cx, cy);
            }
        }
        return cnt;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] board = new int[N + 1][M + 1];
        boolean[][] visit = new boolean[N + 1][M + 1];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            board[a][b] = 1;
        }

        Sol(board, visit, N, M);
    }
}
