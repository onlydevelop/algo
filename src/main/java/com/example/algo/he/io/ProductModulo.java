package com.example.algo.he.io;

import java.util.Scanner;

/*
    https://www.hackerearth.com/problem/algorithm/find-product/
 */
public class ProductModulo {

    public long getProductModulo(int N, int[] a) {
        long mod = 1000000007;
        long result = 1;
        for(int i = 0; i < N; i++) {
            result = result * a[i] % mod;
        }
        return result;
    }

    public long getProductModuloRecursive(int N, int a[]) {
        long mod = 1000000007;
        /*
           ( a[0] * a[1] ... * a[n] ) % mod
           = (a[0] % mod * (a[1] * a[2] ... * a[N]) % mod) % mod
           = (a[i] % mod * getProductModuleImproved(i+1, a)) % mod
         */
        if(N == 1) return a[N - 1] % mod;
        return ((a[N - 1] % mod) * getProductModuloRecursive(N - 1, a)) % mod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.printf("" + new ProductModulo().getProductModulo(N, A));
        System.out.println("");
        System.out.printf("" + new ProductModulo().getProductModuloRecursive(N, A));
    }

}
