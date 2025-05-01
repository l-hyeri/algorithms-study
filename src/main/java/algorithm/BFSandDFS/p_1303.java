package algorithm.BFSandDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_1303 {
    static String[][] board;
    static int[][] checkboard;
    static int N, M;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int result_w;
    static int result_b;
    static int cnt_w;
    static int cnt_b;


    static int DFS_W(int x, int y, String board[][]) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < M && board[nx][ny].equals("W") && checkboard[nx][ny] == 0) {
                checkboard[nx][ny] = 1;
                cnt_w += 1;
                DFS_W(nx, ny, board);
            }
        }
        return cnt_w;
    }

    static int DFS_B(int x, int y, String board[][]) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < M && board[nx][ny].equals("B") && checkboard[nx][ny] == 0) {
                checkboard[nx][ny] = 1;
                cnt_b += 1;
                DFS_B(nx, ny, board);
            }
        }
        return cnt_b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        board = new String[N][M];
        checkboard = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = String.valueOf(line.charAt(j));
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (board[i][j].equals("W")&&checkboard[i][j]==0) {
                    cnt_w = 1;
                    checkboard[i][j]=1;
                    result_w += (DFS_W(i, j, board) * DFS_W(i, j, board));
                }
                if (board[i][j].equals("B")&&checkboard[i][j]==0) {
                    cnt_b = 1;
                    checkboard[i][j]=1;
                    result_b += (DFS_B(i, j, board) * DFS_B(i, j, board));
                }
            }
        }
        System.out.println(result_w + " " + result_b);
    }
}