package com.example.algo.he.implementation;

import java.util.Scanner;

/*
    https://www.hackerearth.com/problem/algorithm/dalton-and-compiler-design/
 */
public class Dalton {
    public String printSectionStrengths(int N) {
        int a = N / 2;
        return (N % 2 == 0) ? a + " " + a : a + " " + (a + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dalton dalton = new Dalton();
        int T = scanner.nextInt();
        for(int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            System.out.println(dalton.printSectionStrengths(N));
        }
    }
}
