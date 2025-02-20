package level.level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p_11659 {
    // 누적합을 미리 구해두고 2~4까지라면 4까지의 누적합에서 1의 누적합을 빼는 걸로 해결.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        list.add(0);
        for (int i = 1; i <= N; i++) {
            list.add(Integer.valueOf(st.nextToken())+list.get(i-1));
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 0 5 4 3 2 1
            sb.append(list.get(b) - list.get(a - 1)).append("\n");
        }

        System.out.println(sb);
    }
}
/* 시간 초과
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int result=0;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for (int j = a-1; j < b; j++) {
                result += arr[j];
            }
            sb.append(result + "\n");
        }
        System.out.println(sb);
* */
