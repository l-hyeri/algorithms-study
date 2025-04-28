package algorithm.BFSandDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p_1260 {
    static int N, M, V;
    static int[][] graph;
    static boolean[] check;
    static Queue<Integer> queue = new LinkedList<>();

    private static void DFS(int v) {
        check[v] = true;
        System.out.print(v+" ");
        for (int i = 0; i <= N; i++) {
            if (graph[v][i] == 1 && !check[i]) {
                DFS(i);
            }
        }
    }

    private static void BFS(int v) {
        queue.add(v);
        check[v]=true;

        while (!queue.isEmpty()) {
            v = queue.poll();
            System.out.print(v+" ");

            for (int i = 0; i <= N; i++) {
                if (graph[v][i] == 1 && !check[i]) {
                    queue.offer(i);
                    check[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][N + 1];  // 정점 초기화
        check = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = 1;  // 양방향 간선을 표현하기 위함
        }
        DFS(V);
        System.out.print("\n");
        check = new boolean[N + 1];
        BFS(V);
    }
}
