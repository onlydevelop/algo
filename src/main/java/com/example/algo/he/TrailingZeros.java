package com.example.algo.he;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/problem/algorithm/trailing-zeros/
 */
public class TrailingZeros {
    public int getTrailingZeros(int n) {
        return n / 5 + n / 25 + n / 125 + n / 625;
    }

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        System.out.println(new TrailingZeros().getTrailingZeros(n));
    }
}
