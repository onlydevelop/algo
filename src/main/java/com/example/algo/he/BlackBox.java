package com.example.algo.he;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 https://www.hackerearth.com/problem/algorithm/blackbox-1-3/
 */
public class BlackBox {
    public String isTriple(double a, double b, double c) {
        double side1 = 0.0;
        double side2 = 0.0;
        double max = 0.0;
        if(a > b) {
            side1 = b;
            if(a > c) {
                side2 = c;
                max = a;
            } else {
                side2 = a;
                max = c;
            }
        } else {
            side1 = a;
            if(b > c) {
                side2 = c;
                max = b;
            } else {
                side2 = b;
                max = c;
            }
        }
        return isCoprime(side1, side2, max) && (max * max - side1 * side1 == side2 * side2) ? "YES" : "NO";
    }

    private boolean isCoprime(double a, double b, double c) {
        return gcd(gcd(a, b), gcd(b, c)) == 1;
    }

    private double gcd(double a, double b) {
        if(a == 0.0 || b == 0.0) return 0.0;
        double remainder = 0.0;
        double big = a;
        double small = b;
        if(b > a) {
            big = b;
            small = a;
        }
        remainder = big % small;
        return (remainder == 0.0) ? small : gcd(small, remainder);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for (int i = 0; i < T; i++) {
            line = br.readLine();
            String[] tokens = line.split(" ");
            double a = Double.parseDouble(tokens[0]);
            double b = Double.parseDouble(tokens[1]);
            double c = Double.parseDouble(tokens[2]);
            System.out.println(new BlackBox().isTriple(a, b, c));
        }
    }
}
