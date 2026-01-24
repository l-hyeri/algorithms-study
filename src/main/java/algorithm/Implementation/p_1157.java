package algorithm.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int length = s.length();
        int[] arr = new int[26];    // 알파벳 개수 26개

        for (int i = 0; i < length; i++) {
            char tmp = s.charAt(i);
            if ('a' <= tmp && tmp <= 'z') { // 소문자인 경우
                arr[tmp - 97]++;
            } else {    // 대문자인 경우
                arr[tmp - 65]++;
            }
        }

        int max = -1;
        char result = '?';
        for (int j = 0; j < 26; j++) {
            if (arr[j] > max) {
                max = arr[j];
                result = (char) (j + 65);
            } else if (arr[j] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}