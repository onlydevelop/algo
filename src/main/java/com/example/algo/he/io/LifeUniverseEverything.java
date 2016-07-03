package com.example.algo.he.io;

import java.util.Scanner;

/*
    https://www.hackerearth.com/problem/algorithm/life-the-universe-and-everything/
 */
public class LifeUniverseEverything {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while ((num = scanner.nextInt())!=42)
        System.out.println(num);
    }
}
