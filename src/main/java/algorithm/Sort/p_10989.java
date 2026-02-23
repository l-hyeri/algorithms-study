package algorithm.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class p_10989 {
    // couting sort 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());

        int[] cnt = new int[10001];
        for (int i = 0; i < N; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }

        for (int j = 0; j < 10001; j++) {

            while (cnt[j] > 0) {
                sb.append(j).append("\n");
                cnt[j]--;
            }
        }

        System.out.println(sb);
    }
}
/*
// Arrays.sort를 사용하는 방법
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        sort(arr);
        for (int j = 0; j < N; j++) {
            sb.append(arr[j]).append("\n");
        }

        System.out.println(sb);
    }
* */