package algorithm.BFSandDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_1189 {

    private static int R;
    private static int C;
    private static int K;
    private static String[][] board;
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, -1, 0, 1};
    private static int result;

    private static void DFS(int x, int y, boolean[][] visit,int cnt) {

        if (cnt > K) {
            return;
        }

        if (x == 0 && y == C - 1 && cnt==K) {
            result+=1;
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < R && ny >= 0 && ny < C && board[nx][ny].equals(".") && !visit[nx][ny]) {
                visit[nx][ny]=true; // 선택
                DFS(nx, ny, visit, cnt+1);  // 선택을 따라 끝까지 탐색
                visit[nx][ny]=false;    // 선택 취소 -> 백트래킹
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        board = new String[R][C];

        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                board[i][j] = String.valueOf(s.charAt(j));
            }
        }

        boolean[][] visit = new boolean[R][C];
        visit[R - 1][0] = true;
        int cnt=1;
        DFS(R - 1, 0, visit ,cnt);
        System.out.println(result);
    }
}
