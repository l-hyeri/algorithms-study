package algorithm.BFSandDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_1303 {
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, -1, 0, 1};

    private static void Sol(String[][] board, boolean[][] visit, int M, int N) {
        int white = 0;
        int blue = 0;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j]) {
                    String color = board[i][j]; // 색 저장
                    int tmp = DFS(board, visit, M, N, i, j, color);
                    int result = tmp * tmp;

                    if (color.equals("W")) {
                        white += result;
                    } else {
                        blue += result;
                    }
                }
            }
        }
        System.out.println(white + " " + blue);
    }

    private static int DFS(String[][] board, boolean[][] visit, int M, int N, int x, int y, String color) {
        int size = 1; // 자기 자신
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < M && ny >= 0 && ny < N && board[nx][ny].equals(color) && !visit[nx][ny]) {
                size += DFS(board, visit, M, N, nx, ny, color);
            }
        }
        return size;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String board[][] = new String[M][N];
        boolean visit[][] = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = String.valueOf(s.charAt(j));
            }
        }
        Sol(board, visit, M, N);
    }
}