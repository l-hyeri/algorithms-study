package level.level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p_11723 {
    static ArrayList<Integer> list = new ArrayList<>(20);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "add":
                    int num1 = Integer.parseInt(st.nextToken());
                    add(num1);
                    break;

                case "check":
                    int num2 = Integer.parseInt(st.nextToken());
                    sb.append(check(num2) + "\n");
                    break;

                case "remove":
                    int num3 = Integer.parseInt(st.nextToken());
                    remove(num3);
                    break;

                case "toggle":
                    int num4 = Integer.parseInt(st.nextToken());
                    toggle(num4);
                    break;

                case "all":
                    all();
                    break;

                case "empty":
                    empty();
                    break;
            }
        }
        System.out.println(sb);
    }

    static void add(int num) {
        list.add(num);
    }

    static int check(int num) {
        if (list.contains(num)) {
            return 1;
        } else {
            return 0;
        }
    }

    static void remove(int num) {
        if (list.contains(num)) {
            // list에서 remove(num)을 하면 num에 해당하는 인덱스 삭제
            // Object로 넘겨줘야 해당 value를 삭제함.
            // 예를 들어 list=[5,7,3,2,4]가 있을 때
            // list.remove(2)을 하면 2번 인덱스를 삭제 -> list=[5,7,2,4]가 됨.
            // list.remove(Integer.valueOf(2))를 하면 value 2를 삭제 -> list=[5,7,3,4]가 됨.
            list.remove(Integer.valueOf(num));
        }
    }

    static void toggle(int num) {
        if (list.contains(num)) {
            remove(num);
        } else {
            add(num);
        }
    }

    static void all() {
        empty();
        for (int i = 1; i < 21; i++) {
            list.add(i);
        }
    }

    static void empty() {
        list.clear();
    }
}
