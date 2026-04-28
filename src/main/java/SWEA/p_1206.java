package SWEA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class p_1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] buildings = new int[N];
            int result = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                buildings[j] = Integer.parseInt(st.nextToken());
            }

            for (int b = 2; b < N - 1; b++) {
                int current = buildings[b]; // 현재 위치
                if (current == 0) {
                    continue;
                }
                int left = buildings[b - 2];  // 조망권 왼쪽
                int right = buildings[b + 2]; // 조망권 오른쪽
                if (left >= current || right >= current) {
                    continue;
                }
                if (buildings[b - 1] > current || buildings[b + 1] > current) {
                    continue;
                }
                int r_left = Math.max(left, buildings[b - 1]);
                int r_right = Math.max(right, buildings[b + 1]);
                int cal = Math.min(current - r_left, current - r_right);
                result += cal;
            }
            System.out.println("#" + (i + 1) + " " + result);
        }
    }
}
