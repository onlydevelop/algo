package com.example.algo.he;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * https://hackerearth.com/problem/algorithm/my-prime/
 */
public class MyPrime {
    public String getPrimeWithLine(int N, String line) {
        String[] sarr = line.split("\\s+");
        Long[] larr = new Long[N];
        for(int i = 0; i < N; i++) {
            larr[i] = Long.parseLong(sarr[i]);
        }
        return getPrime(N, larr);
    }

    private String getPrime(int N, Long[] larr) {
        ArrayList<Long> res = new ArrayList<Long>();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(j != i && (larr[i] % larr[j] == 0)) {
                    break;
                }
                if(j == N -1) {
                    res.add(larr[i]);
                }
            }
        }
        String resList = res.toString();
        return resList.substring(1, resList.length() - 1).replace(", ", " ");
    }

    public static void main(String args[] ) throws Exception {
        MyPrime myPrime = new MyPrime();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        line = br.readLine();

        String[] sarr = line.split("\\s+");
        Long[] larr = new Long[N];
        for(int i = 0; i < N; i++) {
            larr[i] = Long.parseLong(sarr[i]);
        }
        System.out.println(myPrime.getPrime(N, larr));
    }
}
