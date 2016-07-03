package com.example.algo.he.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    https://www.hackerearth.com/problem/algorithm/modify-the-string/
 */
public class ToggleString {
    String changeCase(String str) {
        char[] array = str.toCharArray();
        for(int i = 0; i < array.length; i++) {
            array[i] ^= 32;
        }
        return new String(array);
    }

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str);
        System.out.println(new ToggleString().changeCase(str));
    }
}
