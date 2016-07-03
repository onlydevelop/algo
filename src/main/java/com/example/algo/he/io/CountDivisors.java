package com.example.algo.he.io;

import java.util.Scanner;

/*
    https://www.hackerearth.com/problem/algorithm/count-divisors/
 */
public class CountDivisors {

    public int getCount(int l, int r, int k) {
        int remainder = l % k;
        int count = (remainder == 0) ? 1 : 0;
        count += (r - l + remainder) / k;
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(new CountDivisors().getCount(l, r, k));
    }
}
