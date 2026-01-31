package algorithm.Implementation;

import java.lang.*;
import java.util.*;
import java.io.*;

public class p_1063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String king = st.nextToken();
        String stone = st.nextToken();
        int N = Integer.parseInt(st.nextToken());


        int krow = 8 - Integer.parseInt(String.valueOf(king.charAt(1))) + 1;
        int kcol = king.charAt(0) - 65 + 1;
        int srow = 8 - Integer.parseInt(String.valueOf(stone.charAt(1))) + 1;
        int scol = stone.charAt(0) - 65 + 1;

        Map<String, int[]> map = new HashMap<>();
        map.put("R", new int[]{0, 1});
        map.put("L", new int[]{0, -1});
        map.put("B", new int[]{1, 0});
        map.put("T", new int[]{-1, 0});
        map.put("RT", new int[]{-1, 1});
        map.put("LT", new int[]{-1, -1});
        map.put("RB", new int[]{1, 1});
        map.put("LB", new int[]{1, -1});

        for (int i = 0; i < N; i++) {
            String move = br.readLine();

            int drow = map.get(move)[0];
            int dcol = map.get(move)[1];

            int nkrow = krow + drow;
            int nkcol = kcol + dcol;

            if (nkrow < 1 || nkrow > 8 || nkcol < 1 || nkcol > 8) { // 킹이 범위를 벗어나는 경우
                continue;
            }

            if (nkrow == srow && nkcol == scol) {   // 킹이 스톤의 자리로 가는 경우
                int nsrow = srow + drow;
                int nscol = scol + dcol;

                if (nsrow < 1 || nsrow > 8 || nscol < 1 || nscol > 8) { // 스톤이 범위를 벗어나는 경우
                    continue;
                }

                srow = nsrow;
                scol = nscol;
            }

            krow = nkrow;
            kcol = nkcol;
        }

        char kalpha = (char) (kcol + 64);
        char salpha = (char) (scol + 64);

        sb.append(kalpha).append(9 - krow).append("\n").append(salpha).append(9 - srow);
        System.out.println(sb);
    }
}
/*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String king = st.nextToken();
        String stone = st.nextToken();
        int N = Integer.parseInt(st.nextToken());


        int krow = 8 - Integer.parseInt(String.valueOf(king.charAt(1))) + 1;
        int kcol = king.charAt(0) - 65 + 1;
        int srow = 8 - Integer.parseInt(String.valueOf(stone.charAt(1))) + 1;
        int scol = stone.charAt(0) - 65 + 1;

        for (int i = 0; i < N; i++) {
            String move = br.readLine();

            if (move.equals("R")) { // 한칸 오른쪽
                int ktmp = kcol + 1;
                int stmp = scol + 1;
                if (ktmp == scol && srow == krow) {   // 킹이 스톤으로 갈 때
                    if (ktmp <= 8 && stmp <= 8) {
                        kcol += 1;
                        scol += 1;
                    }
                } else {  // 킹만 이동
                    if (ktmp <= 8) {
                        kcol += 1;
                    }
                }
            } else if (move.equals("L")) {  // 한칸 왼쪽
                int ktmp = kcol - 1;
                int stmp = scol - 1;
                if (ktmp == scol && srow == krow) { // 킹이 스톤으로 갈 떄
                    if (ktmp > 0 && stmp > 0) {
                        kcol -= 1;
                        scol -= 1;
                    }
                } else {  // 킹만 이동
                    if (ktmp > 0) {
                        kcol -= 1;
                    }
                }

            } else if (move.equals("B")) {
                int ktmp = krow + 1;
                int stmp = srow + 1;
                if (ktmp == srow && kcol == scol) {
                    if (ktmp <= 8 && stmp <= 8) {
                        krow += 1;
                        srow += 1;
                    }
                } else {
                    if (ktmp <= 8) {
                        krow += 1;
                    }
                }
            } else if (move.equals("T")) {
                int ktmp = krow - 1;
                int stmp = srow - 1;
                if (ktmp == srow && kcol == scol) {
                    if (ktmp > 0 && stmp > 0) {
                        krow -= 1;
                        srow -= 1;
                    }
                } else {
                    if (ktmp > 0) {
                        krow -= 1;
                    }
                }

            } else if (move.equals("RT")) { // 오른쪽 위 대각선
                int kcol_tmp = kcol + 1;
                int krow_tmp = krow - 1;
                int scol_tmp = scol + 1;
                int srow_tmp = srow - 1;
                if (kcol_tmp == scol && krow_tmp == srow) {
                    if (kcol_tmp <= 8 && krow_tmp > 0 && scol_tmp <= 8 && srow_tmp > 0) {
                        kcol += 1;
                        krow -= 1;
                        scol += 1;
                        srow -= 1;
                    }
                } else {
                    if (kcol_tmp <= 8 && krow_tmp > 0) {
                        kcol += 1;
                        krow -= 1;
                    }
                }

            } else if (move.equals("LT")) { // 왼쪽 위 대각선
                int kcol_tmp = kcol - 1;
                int krow_tmp = krow - 1;
                int scol_tmp = scol - 1;
                int srow_tmp = srow - 1;
                if (kcol_tmp == scol && krow_tmp == srow) {
                    if (kcol_tmp > 0 && krow_tmp > 0 && scol_tmp > 0 && srow_tmp > 0) {
                        kcol -= 1;
                        krow -= 1;
                        scol -= 1;
                        srow -= 1;
                    }
                } else {
                    if (kcol_tmp > 0 && krow_tmp > 0) {
                        kcol -= 1;
                        krow -= 1;
                    }
                }

            } else if (move.equals("RB")) { // 오른쪽 아래 대각선
                int kcol_tmp = kcol + 1;
                int krow_tmp = krow + 1;
                int scol_tmp = scol + 1;
                int srow_tmp = srow + 1;
                if (kcol_tmp == scol && krow_tmp == srow) {
                    if (kcol_tmp <= 8 && krow_tmp <= 8 && scol_tmp <= 8 && srow_tmp <= 8) {
                        kcol += 1;
                        krow += 1;
                        scol += 1;
                        srow += 1;
                    }
                } else {
                    if (kcol_tmp <= 8 && krow_tmp <= 8) {
                        kcol += 1;
                        krow += 1;
                    }
                }

            } else if (move.equals("LB")) { // 왼쪽 아래 대각선
                int kcol_tmp = kcol - 1;
                int krow_tmp = krow + 1;
                int scol_tmp = scol - 1;
                int srow_tmp = srow + 1;
                if (kcol_tmp == scol && krow_tmp == srow) {
                    if (kcol_tmp > 0 && krow_tmp <= 8 && scol_tmp > 0 && srow_tmp <= 8) {
                        kcol -= 1;
                        krow += 1;
                        scol -= 1;
                        srow += 1;
                    }
                } else {
                    if (kcol_tmp > 0 && krow_tmp <= 8) {
                        kcol -= 1;
                        krow += 1;
                    }
                }
            }
        }
        char kalpha = (char) (kcol + 64);
        char salpha = (char) (scol + 64);

        sb.append(kalpha).append(9 - krow).append("\n").append(salpha).append(9 - srow);
        System.out.println(sb);

    }
* */