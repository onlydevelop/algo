package com.example.algo.he.implementation;

import java.util.Scanner;

public class Dushhera {
    public String getWinCombination(int p, int k) {
        int min = k + 1;
        String result = "" + min;
        for(int i = 2; i <= p; i++) {
            result += " " + (min * i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-- > 0) {
            int p = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(new Dushhera().getWinCombination(p, k));
        }
    }
}
