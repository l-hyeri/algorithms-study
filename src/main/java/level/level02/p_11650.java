package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class p_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] f, int[] b) {  // f가 앞에 있는 값, b가 뒤에 있는 값
                if (f[0] == b[0]) { // 첫번째 원소가 같으면
                    return f[1] - b[1]; // 두번째 원소 비교
                } else {
                    return f[0] - b[0];
                }
            }
        });

        for (int i = 0; i < N; i++) {
            sb.append((arr[i][0]) + " " + arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}

/**
 * [이차원 배열 사용] Arrays.sort()는 1차원이기 때문에 람다식으로 확장
 * sort메소드는 두 가지 인자를 받을 수 있음
 * Comparator 사용 -> 우선순위를 사용자화 함.
 *
 * arr[N][2] 2차원 배열 선언
 * arr[i][0]과 arr[i+1][0] 비교 -> 만약 값이 같으면 arr[i][1]과 arr[i+1][1] 비교
 *
 * [람다식]
 * public int sum(int a, int b) {
 * return a + b;
 * }
 *
 * (int a,int b)->{return a+b;}
 */
