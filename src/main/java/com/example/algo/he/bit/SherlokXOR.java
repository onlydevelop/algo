package com.example.algo.he.bit;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SherlokXOR {

    public long countPairs(long A[]) {

        long odd = 0;
        for(int i = 0; i < A.length; i++) {
            if ((A[i] & 1) == 1) odd++;
        }
        return odd * (A.length - odd);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        while (T-- > 0) {
            line = br.readLine();
            line = br.readLine();
            String[] arr = line.split("\\s+");
            long[] A = new long[arr.length];
            for(int i = 0; i < arr.length; i++) {
                A[i] = Long.parseLong(arr[i]);
            }
            System.out.println(new SherlokXOR().countPairs(A));
        }
    }
}
