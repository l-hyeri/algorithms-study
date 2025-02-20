package level.level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p_11399 {
    public static void main(String[] args) throws IOException {
        // Counting sort
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];

        st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            // 첫번째 들어온 3은 3번 인덱스에 들어감. -> 1
            // 두번째 들어온 1은 1전 인덱스에 들어감. -> 1
            // 네번째 들어온 3은 3번 인덱스에 들어감. -> 2
            arr[Integer.parseInt(st.nextToken())]++;
        }
        // [1]=1 [2]=1 [3]=2 [4]=1

        int prev=0; // 이전까지의 대기시간 누적합
        int sum=0;  // 사람별 대기시간 총합

        for (int i = 0; i < 1001; i++) {
            while (arr[i]-- > 0) {  // 해당 i index가 0이 될때까지 반복
                sum += (i + prev);  // 이전까지의 대기시간과 현재 사람이 걸리는 시간 더함.
                prev += i;  // 이전까지의 누적합에 현재 걸리는 시간 더함.

                // [1] -> sum=1, prev=1
                // [2] -> sum=(1+2)+1=4, prev=2+1=3
                // [3] -> sum=(3+3)+4=10, prev=3+3=6
                // [3] -> sum=(3+6)+10=19, prev=6+3=9
                // [4] -> sum=(4+9)+19=32, prev=9+4=13
            }
        }
        System.out.println(sum);
    }
}

/* [1] Arrays.sort
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int result=0;

        for (int i = 1; i < N; i++) {
            arr[i] = arr[i - 1] + arr[i];
            result += arr[i];
        }
        System.out.println(result+arr[0]);
* */