package algorithm.Implementation;

import java.util.*;
import java.lang.*;
import java.io.*;

public class p_8911 {
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int x = 0;
            int y = 0;
            int maxX = 0;
            int maxY = 0;
            int minX = 0;
            int minY = 0;
            int dir = 0;
            String s = br.readLine();
            int length = s.length();

            for (int j = 0; j < length; j++) {
                char word = s.charAt(j);
                if (word == 'F') {
                    x += dx[dir];
                    y += dy[dir];
                    maxX = Math.max(x, maxX);
                    maxY = Math.max(y, maxY);
                    minX = Math.min(x, minX);
                    minY = Math.min(y, minY);
                } else if (word == 'B') {
                    x -= dx[dir];
                    y -= dy[dir];
                    maxX = Math.max(x, maxX);
                    maxY = Math.max(y, maxY);
                    minX = Math.min(x, minX);
                    minY = Math.min(y, minY);
                } else if (word == 'L') {
                    dir = (dir + 3) % 4;
                } else if (word == 'R') {
                    dir = (dir + 1) % 4;
                }
            }
            int height=maxY-minY;
            int width = maxX - minX;
            sb.append(height * width + "\n");
        }
        System.out.println(sb);
    }
}