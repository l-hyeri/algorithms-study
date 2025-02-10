package level.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
/**
 * int max = arr[0]으로 구현할 경우 -5, -5, -5, -5로 숫자가 주어졌을 때 index가 4가 출력되어야함.
 * -> 위 코드로 구현하면 if를 한번도 만족하지 않기 때문에 index가 0으로 출력됨.
 * -> max=0으로 구현해야함.
 * */
