package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
/** [HashMap] -> Map은 키와 값으로 구성된 Entry 객체를 저장하는 구조 (키, 값 = 객체)
 * 값은 중복 저장 o / 키는 중복 저장 x (동일한 키 값으로 저장하면 기존의 값은 없어지고 새로운 값으로 대체)
 *
 * geOrDefault(Object key, V DefaultValue)
 * key : 값을 가져와야 하는 요소의 키
 * defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값
 * -> 찾는 key가 존재하면 key에 매핑된 값을 반환, 그렇지 않으면 default 값 반환
 * */
public class p_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            // key에 대해 map에 저장된 value를 반환
            // value값이 없을 경우 defaultValue값 반환
            // 즉, 값이 존재하면 카운트해서 저장함.
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int check = Integer.parseInt(st.nextToken());
            if (map.containsKey(check)) {   // map에 값이 들어있는지 확인
                sb.append("1" + "\n");
            } else {
                sb.append("0" + "\n");
            }
        }
        System.out.println(sb);
    }
}
/*  시간 초과
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            int check=0;

            for (int i = 0; i < N; i++) {
                if (arr[i] == num) {
                    sb.append("1" + "\n");
                    check+=1;
                }
            }

            if (check == 0) {
                sb.append("0" + "\n");
            }
        }
        System.out.println(sb);
    }
* */

/*  [1] HashMap 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            // key에 대해 map에 저장된 value를 반환
            // value값이 없을 경우 defaultValue값 반환
            // 즉, 값이 존재하면 카운트해서 저장함.
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int check = Integer.parseInt(st.nextToken());
            if (map.containsKey(check)) {   // map에 값이 들어있는지 확인
                sb.append("1" + "\n");
            } else {
                sb.append("0" + "\n");
            }
        }
        System.out.println(sb);
    }

* */