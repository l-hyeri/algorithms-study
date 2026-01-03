package algorithm.Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] board = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            String s = br.readLine();
            for (int j = 1; j <= M; j++) {
                board[i][j] = Integer.parseInt(String.valueOf(s.charAt(j - 1)));
            }
        }

        int length = Math.min(N, M);

        // 중복 코드 제거
        for (int len = length; len >= 1; len--) {
            for (int i = 1; i + len - 1 <= N; i++) {
                for (int j = 1; j + len - 1 <= M; j++) {

                    int num = board[i][j];
                    int mTmp = j + len - 1;
                    int nTmp = i + len - 1;

                    if (num == board[i][mTmp] &&
                            num == board[nTmp][j] &&
                            num == board[nTmp][mTmp]) {
                        System.out.println(len * len);
                        return;
                    }
                }
            }
        }
    }
}
/* [처음 코드]
while (true) {
            if (check == 1) {
                break;
            }
            if (length == 1) {
                System.out.println(1);
                break;
            }


            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    int a = board[i][j];

                    int mTmp = j + length - 1;
                    int nTmp = i + length - 1;

                    if (mTmp <= M && nTmp <= N) {
                        if (a == board[i][mTmp] &&
                                a == board[nTmp][j] &&
                                a == board[nTmp][mTmp]) {
                            System.out.println(length * length);
                            check = 1;
                            break;
                        }
                    }
                }
                if (check == 1) {
                    break;
                }
            }
            length -= 1;
        }
* */