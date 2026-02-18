package algorithm.Set;

import java.io.*;
import java.util.*;
import java.lang.*;

public class p_11478 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int length=s.length();

        Set<String> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                set.add(s.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}