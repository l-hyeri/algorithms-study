package algorithm.Map;

import java.util.*;
import java.io.*;
import java.lang.*;

public class p_17219 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String address = st.nextToken();
            String PW=st.nextToken();

            map.put(address, PW);
        }

        for (int j = 0; j < M; j++) {
            String findAddress=br.readLine();
            sb.append(map.get(findAddress)).append("\n");
        }
        System.out.println(sb);
    }
}
