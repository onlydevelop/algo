package com.example.algo.he.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    https://www.hackerearth.com/problem/algorithm/palindrome-check-2/
 */
public class Palindrom {

    public String isPalindrom(String str) {
        char[] a = str.toCharArray();
        int length = a.length;
        for(int i = 0; i < length/2; i++) {
            if(a[i] != a[length - i - 1]) return "FALSE";
        }
        return "TRUE";
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(new Palindrom().isPalindrom(line));
    }
}
