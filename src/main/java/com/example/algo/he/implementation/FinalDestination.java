package com.example.algo.he.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/problem/algorithm/final-destination-cakewalk/
 */
public class FinalDestination {

    public String getDestination(String s) {
        char[] ary = s.toCharArray();
        int x = 0;
        int y = 0;
        for(int i = 0; i < ary.length; i++) {
            if(ary[i] == 'L') x--;
            if(ary[i] == 'R') x++;
            if(ary[i] == 'D') y--;
            if(ary[i] == 'U') y++;
        }
        return x + " " + y;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(new FinalDestination().getDestination(s));
    }
}
