package algorithm.BFSandDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_2606 {
    private static void Sol(int[][] board, boolean[] visit, int N) {
        int result = 0;
        visit[1] = true;
        for (int i = 1; i <= N; i++) {
            if (board[1][i] == 1 && !visit[i]) {
                result += DFS(board, visit, N, i);
            }
        }
        System.out.println(result);
    }

    private static int DFS(int[][] board, boolean[] visit, int N, int i) {
        visit[i] = true;
        int cnt = 1;

        for (int k = 0; k <= N; k++) {
            if (board[i][k] == 1 && !visit[k]) {
                cnt += DFS(board, visit, N, k);
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[][] board = new int[N + 1][N + 1];
        boolean[] visit = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            board[a][b] = board[b][a] = 1;
        }

        Sol(board, visit, N);
    }
}
