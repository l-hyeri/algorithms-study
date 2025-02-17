package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_1018 {
    static int check(int startrow, int startcol, String[] board) {
        String[] check_board = {"WBWBWBWB", "BWBWBWBW"};    // 정답지

        int white = 0;  // 변경해야하는 white 개수

        for (int i = 0; i < 8; i++) {
            int row = startrow + i;
            for (int j = 0; j < 8; j++) {
                int col = startcol + j;
                if (board[row].charAt(col) != check_board[row % 2].charAt(j)) {
                    // 매개변수로 가져오는 board의 상태와 정답지의 상태를 비교
                    // check_board을 index를 2개만 넣어서 값이 넘칠수도 있기 때문에 row%2
                    // check_board에서 하나의 문자열이 8개만 가지고 있기 때문에 j 사용
                    white += 1;
                }
            }
        }
        // black을 바꿔야하는 개수는 (전체 - white 바꿔야하는 개수)
        // 두 값을 비교해서 작은값 return
        return Math.min(white, 64 - white);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] board = new String[N];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine();
        }

        int result = Integer.MAX_VALUE; // 가장 큰 값으로 지정
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int count = check(i, j, board);

                if (count < result) {
                    result = count;
                }
            }
        }
        System.out.println(result);
    }
}
