package com.example.algo.he.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/problem/algorithm/psychic-powers/
 */
public class LittleJhul {

    public String checkString(String s) {
        char[] ary = s.toCharArray();
        int flag = 0;
        for(int i = 0; i < ary.length; i++) {
            if(ary[i] == '0') {
                if(flag > 0) flag = 0;
                flag = flag - 1;
            } else {
                if(flag < 0) flag = 0;
                flag = flag + 1;
            }
            if(Math.abs(flag) == 6) return "Sorry, sorry!";
        }
        return "Good luck!";
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(new LittleJhul().checkString(s));
    }
}
