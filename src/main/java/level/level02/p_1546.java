package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_1546 {
    // [2] array 정렬 직접 구현
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];
        double max=0;
        double sum=0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] / max * 100;
            sum += arr[i];
        }
        System.out.println(sum / N);
    }
}

/* Arrays.sort와 직접 구현한 코드 메모리, 시간 차이 없음.
    [1] Arrays.sort 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        double max = arr[N - 1];
        double result = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] / max * 100;
            result += arr[i];
        }
        System.out.println(result / N);
* */
