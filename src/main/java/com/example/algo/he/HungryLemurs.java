package com.example.algo.he;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/problem/algorithm/hungry-lemurs/
 */
public class HungryLemurs {
    public int getMinSteps(String line) {

        String[] input = line.split("\\s+");
        int bananaCount = Integer.parseInt(input[0]); // Bananas
        int lemurCount = Integer.parseInt(input[1]); // Lemurs

        if(bananaCount == lemurCount) {
            return 0;
        }

        if(bananaCount == 1) {
            return 1;
        }

        if(lemurCount < 2 || bananaCount < 0) {
            return 0;
        }

        if(lemurCount > bananaCount) {
            int minSteps = (lemurCount-bananaCount < bananaCount) ? lemurCount-bananaCount : bananaCount;
            return minSteps;
        }

        //String line = "100 8";
        // 100/7 = 14.2
        // 7 * 14 = 98
        // 7 * 15 = 105
        // 100/8 = 12.5 = 12
        // 8 * 12 = 96
        // 8 * 13 = 104
        // 100/9 = 11.1
        // 9 * 11 = 99
        // 9 * 12 = 108
        int minSteps = Integer.MAX_VALUE;
        for(int i = lemurCount/2; i <= lemurCount * 1.5; i++) {
            int backwardSteps = bananaCount % i;
            int forwardSteps = (((bananaCount / i) + 1) * i) % bananaCount;
            int steps = Math.min(forwardSteps, backwardSteps);
            int totalSteps = steps + Math.abs(lemurCount - i);
            if(totalSteps < minSteps) {
                minSteps = totalSteps;
            }
        }
        return minSteps;
    }

    public static void main(String args[] ) throws Exception {
        HungryLemurs hungryLemurs = new HungryLemurs();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(hungryLemurs.getMinSteps(line));
    }
}
