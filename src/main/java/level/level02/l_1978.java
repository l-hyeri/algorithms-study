package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class l_1978 {
    public static void main(String[] args) throws IOException {
        // 소수는 1과 자기 자신만을 가져야함. -> 약수 활용
        // 합성수 Number = A X B라고 할 때, A와 B는 Number의 제곱근보다 작거나 같아야함. -> 넘어가면 성립하지 않음.
        // 약수를 구하는 방법 : 제곱급보다 크기 전까지 for문을 돌려 나머지가 0인것을 찾음.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt=0;
        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            boolean check=true; // 소수인 경우 true, 아닌 경우 false
            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                continue;
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
/* [1] 해당 숫자까지 처음부터 나눠가며 소수 찾기
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int cnt = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int tmp = 0;
            arr[i] = Integer.parseInt(st.nextToken());

            if (arr[i] != 1) {
                for (int j = 2; j <= arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        tmp += 1;
                    }
                }
            }

            if (tmp == 1) {
                cnt +=1;
            }
        }
        System.out.println(cnt);
* */