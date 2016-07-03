package com.example.algo.he.bit;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
https://www.hackerearth.com/problem/algorithm/subset-xor-4/
 */
public class SubsetXOR {
    /*
        For set = {a,b,c} -> PowerSet(A) is
        - - c
        - b -
        - b c
        a - -
        a - c
        a b -
        a b c
        So, each element coming (2 ^ N / 2) times
        We know: a ^ ( b ^ a ) = a ^ b ^ a = a ^ a ^ b
        So it boils down to: (xor a (2 ^ N / 2) times) ^ (xor b (2 ^ N / 2) times) ...
        Now, xor a k times with a = 0, if k = even and a if k = odd
        Here, for any N > 1,  (2 ^ N / 2) is even so, result is always zero
     */
    public int getXORValue(int N, int K) {
        return N == 1 ? K : 0;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = getNextTokens(br);
        int T = Integer.parseInt(input[0]);
        while(T-- > 0) {
            input = getNextTokens(br);
            int N = Integer.parseInt(input[0]);
            int result = 0;
            input = getNextTokens(br);
            int K = Integer.parseInt(input[0]);
            result = new SubsetXOR().getXORValue(N, K);
            System.out.println(result);
        }
    }

    public static String[] getNextTokens(BufferedReader br) throws Exception {
        String line = br.readLine();
        return line.split("\\s+");
    }
}
