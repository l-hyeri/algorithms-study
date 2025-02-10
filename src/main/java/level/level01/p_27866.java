package level.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String array[] = s.split("");

        int i = Integer.parseInt(br.readLine());

        System.out.println(array[i - 1]);
    }
}
