package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class p_2751 {
    public static void main(String[] args) throws IOException {
        // Collections.sort -> 최악의 경우 : O(nlogn)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int value : list) {
            sb.append(value).append("\n");
        }
        System.out.println(sb);
    }
}
/* [Arrays.sort 사용] -> 평균 시간 복잡도 : O(nlogn) , 최악의 경우 : O(n^2)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
* */
