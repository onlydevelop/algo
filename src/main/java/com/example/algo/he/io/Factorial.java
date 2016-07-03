package com.example.algo.he.io;

import java.util.Scanner;

/*
    https://www.hackerearth.com/problem/algorithm/find-factorial/
 */
public class Factorial {

    public int calculate(int N) {
        int result = 1;
        for(int i = 1; i <= N; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(new Factorial().calculate(N));
    }
}
