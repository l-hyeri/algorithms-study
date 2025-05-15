package algorithm.BFSandDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p_2178 {
    static int[][] board;
    static boolean[][] check;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    private static int BFS(int N, int M, int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        check[x][y] = true;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] c = q.poll();
                int cx = c[0];
                int cy = c[1];

                for (int j = 0; j < 4; j++) {
                    int nx = cx + dx[j];
                    int ny = cy + dy[j];

                    if (nx > 0 && nx <= N && ny > 0 && ny <= M && board[nx][ny] == 1 && !check[nx][ny]) {
                        q.offer(new int[]{nx, ny});
                        check[nx][ny] = true;
                        board[nx][ny] = board[cx][cy] + 1;
                    }
                }
            }

        }
        return board[N][M];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new int[N + 1][M + 1];
        check = new boolean[N + 1][M + 1];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i + 1][j + 1] = Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }

        System.out.println(BFS(N, M, 1, 1));
    }
}
