package level.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
/**
 * 예외 발생 : add , remove , element
 * 값 리턴 (null) : offer , poll , peek
 * */
public class p_2164 {
    public static void main(String[] args) throws IOException {
        // Queue 라이브러리 사용 x -> 시간 빠름
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N*2];

        for (int i = 1; i <=N; i++) {
            arr[i] = i;
        }

        int top=N;
        int bottom=1;

        // 1 2 3 4 5 6 7 8
        // 1 2 3b 4 2t N=3 -> 3 4 2
        // 1 2 3 4 2b 4t N=2 -> 2 4
        while (N-- > 1) {
            bottom+=1;  // 2
            arr[top + 1] = arr[bottom]; // [5]번 자리에 2가 들어감.
            bottom+=1; // 3
            top+=1;
        }
        System.out.println(arr[bottom]);
    }
}
/* remove, peek 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> que =new LinkedList<Integer>();

        for (int i = 1; i <=N; i++) {
            que.add(i);
        }

        while (que.size() != 1) {
            que.remove();
            que.add(que.peek());
            que.remove();
        }
        System.out.println(que.peek());
* */