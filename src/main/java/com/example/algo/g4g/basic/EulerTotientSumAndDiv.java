package com.example.algo.g4g.basic;

import java.util.Scanner;

/**
 * https://www.practice.geeksforgeeks.org/problem-page.php?pid=880
 */
public class EulerTotientSumAndDiv {

    public long getSum(long N) {
        return N;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-- > 0) {
            long N = scanner.nextLong();
            System.out.println(new EulerTotientSumAndDiv().getSum(N));
        }
    }
}
