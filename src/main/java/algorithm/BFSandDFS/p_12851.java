package algorithm.BFSandDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p_12851 {

    private static int N;
    private static int K;

    private static final int MAX_POSITION=100001;

    private static void BFS() {
        int minTime = Integer.MAX_VALUE;
        int result = 0;

        Queue<int[]> q = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();

        q.offer(new int[]{N, 0});
        map.put(N, 0);

        while (!q.isEmpty()) {
            int[] c = q.poll();
            int num = c[0];
            int time = c[1];

            if (num == K) {
                minTime = Math.min(time, minTime);
                if (minTime < time) {
                    result = 1;
                } else if (minTime == time) {
                    result += 1;
                }
                continue;
            }

            int[] tmp = {num - 1, num + 1, num * 2};

            for (int checkNum : tmp) {
                if (checkNum >= 0 && checkNum < MAX_POSITION) {
                    // 문제에서 주어진 동생의 범위 사이에 존재하는지 확인
                    // 현재 확인하고 있는 숫자의 시간을 가져옴. (없으면 무한대로 간주)
                    int currentTime = map.getOrDefault(checkNum, Integer.MAX_VALUE);

                    if (currentTime >= time + 1) {
                        // 현재 확인하고 있는 시간이 기존 시간보다 더 짧거나 같을 경우
                        q.offer(new int[]{checkNum, time + 1});
                        map.put(checkNum, time + 1);

                    }
                }
            }

        }
        System.out.println(minTime);
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        BFS();
    }
}
