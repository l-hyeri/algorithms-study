package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
/**
 * HashMap<key, value>
 * key = 입력되는 원소
 * value = 원소의 개수(=중복 입력된 원소의 수)
 * */
public class p_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());
            
            // key에 대해 map에 저장된 value를 반환
            // value값이 없을 경우 defaultValue값 반환
            // 즉, 값이 존재하면 카운트해서 저장함.
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i=0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());
            // 데이터 반환 : getOrDefault
            sb.append(map.getOrDefault(key, 0)).append(" ");
        }

        System.out.println(sb);
    }
}

/* 아래 코드로 구현 : 시간 초과
* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] card = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] num = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int cnt = 0;
            num[i] = Integer.parseInt(st.nextToken());

            for (int j = 0; j < N; j++) {
                if (num[i] == card[j]) {
                    cnt += 1;
                }
            }
            sb.append(cnt).append(" ");
        }
        System.out.println(sb);
* */
