package com.example.algo.g4g.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    https://www.practice.geeksforgeeks.org/problem-page.php?pid=821
 */
public class ShortestDirection {
    public String getShortestDir(String direction) {
        int N = 0;
        int E = 0;
        String result = "";
        char[] steps = direction.toCharArray();
        for(int i = 0; i < steps.length; i++) {
            if(steps[i] == 'N') N++;
            else if (steps[i] == 'S') N--;
            else if (steps[i] == 'E') E++;
            else if (steps[i] == 'W') E--;
        }

        if(E > 0) result += repeat(E, "E");
        if(N > 0) result += repeat(N, "N");
        if(N < 0) result += repeat(-N, "S");
        if(E < 0) result += repeat(-E, "W");

        return result;
    }

    private String repeat(int n, String s) {
        return new String(new char[n]).replace("\0", s);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        while(T-- > 0) {
            line = br.readLine();
            System.out.println(new ShortestDirection().getShortestDir(line));
        }
    }
}
