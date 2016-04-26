package com.example.algo.he;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://hackerearth.com/problem/algorithm/roy-and-wobbly-numbers/
 */
public class Wobbly {
    public String findWobbly(int N, int K) {
        if (K > 81) {
            return "-1";
        }
        int finalTensDigit = (int) Math.ceil(K / 9.0);
        int finalUnitsDigit = (K - 1) % 9 + 1;
        if (finalUnitsDigit <= finalTensDigit) {
            finalUnitsDigit--;
        }

        String result = "";
        for (int j = 1; j <= N; j++) {
            result = (j % 2 == 0) ? result + finalUnitsDigit : result + finalTensDigit;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        // 1,2,3,4,5,6,7,8,9,10
        // 11,12,13,14,15,16,17,18,19,20

        // 10,12,13,14,15,16,17,18,19,
        // 20,21,23,24,25,26,27,28,29,
        // 30,31,32,34,35,36,37,38,39
        //...
        // 90,91,92,93,94,95,96,97,98
        Wobbly wobbly = new Wobbly();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for (int t = 0; t < T; t++) {
            line = br.readLine();
            String[] tokens = line.split("\\s+");
            int N = Integer.parseInt(tokens[0]);
            int K = Integer.parseInt(tokens[1]);
            System.out.println(wobbly.findWobbly(N, K));
        }
    }
}
