package com.example.algo.he;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/problem/algorithm/numbers-of-interest-1/
 */
public class NumbersOfInterest {
    public long getNthTerm(int X, int Y, int N) {
        long[] series = new long[N + 1];// 1-based to reduce complexity
        for(int i = 1; i <= N; i++) {
            if(i <= X) {
                series[i] = Y;
            } else {
                for(int j = i - X; j <= i - 1; j++) {
                    series[i] += series[j];
                }
            }
        }
        return series[N];
    }

    public static void main(String[] args) throws Exception {
        NumbersOfInterest numbersOfInterest = new NumbersOfInterest();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        long T = Integer.parseInt(line);
        for (long i = 0; i < T; i++) {
            line = br.readLine();
            String[] inputs = line.split(" ");
            int X = Integer.parseInt(inputs[0]);
            int Y = Integer.parseInt(inputs[1]);
            int N = Integer.parseInt(inputs[2]);
            System.out.println(numbersOfInterest.getNthTerm(X, Y, N));
        }
    }
}
