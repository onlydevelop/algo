package com.example.algo.basic;

public class GCD {
    public int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(new GCD().gcd(42, 56));
    }
}
