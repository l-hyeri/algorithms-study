package algorithm.BFSandDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p_16930 {
    static int board[][];

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    private static int BFS(int N, int M, int K, int x1, int y1, int x2, int y2) {
        Queue<int[]> q = new LinkedList<>();
        int[][] check = new int[N + 1][M + 1];

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M; j++) {
                check[i][j] = -1;
            }
        }
        q.offer(new int[]{x1, y1});
        check[x1][y1] = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] c = q.poll();
                int cx = c[0];
                int cy = c[1];

                for (int j = 0; j < 4; j++) {
                    for (int k = 1; k <= K; k++) {
                        int nx = cx + dx[j] * k;
                        int ny = cy + dy[j] * k;

                        if (nx < 1 || nx > N || ny < 1 || ny > M) {
                            break;
                        }
                        if (board[nx][ny] == 0) {
                            break;
                        }
                        if (check[nx][ny] != -1) {
                            if (check[nx][ny] < check[cx][cy] + 1) {
                                break;
                            } else {
                                continue;
                            }
                        }

                        check[nx][ny] = check[cx][cy] + 1;
                        q.offer(new int[]{nx, ny});

                        if (nx == x2 && ny == y2) {
                            return check[nx][ny];
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        board = new int[N + 1][M + 1];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                if (String.valueOf(s.charAt(j)).equals(".")) {
                    board[i + 1][j + 1] = 1;
                } else {
                    board[i + 1][j + 1] = 0;
                }
            }
        }

        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        System.out.println(BFS(N, M, K, x1, y1, x2, y2));
    }
}
