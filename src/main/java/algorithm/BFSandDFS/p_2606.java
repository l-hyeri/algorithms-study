package algorithm.BFSandDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_2606 {
    static int A, B;
    static int board[][];
    static boolean check[];

    static int cnt;

    static int DFS(int v) {
        cnt += 1;
        check[v] = true;
        for (int i = 1; i <= A; i++) {
            if (board[v][i] == 1 && !check[i]) {
                DFS(i);
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());

        board = new int[A + 1][A + 1];
        check = new boolean[A + 1];

        for (int i = 0; i < B; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            board[x][y] = board[y][x] = 1;
        }
        System.out.println(DFS(1) - 1);
    }
}
