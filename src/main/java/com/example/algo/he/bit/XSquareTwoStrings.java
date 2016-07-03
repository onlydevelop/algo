package com.example.algo.he.bit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class XSquareTwoStrings {

    public String hasSubsequence(String a, String b) {
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();

        HashSet<Character> firstSet = new HashSet<Character>();
        HashSet<Character> secondSet = new HashSet<Character>();

        for(int i = 0; i < first.length; i++) {
            firstSet.add(first[i]);
        }

        for(int i = 0; i < second.length; i++) {
            secondSet.add(second[i]);
        }

        Iterator<Character> iterator = firstSet.iterator();
        while(iterator.hasNext()) {
            if(secondSet.contains(iterator.next())) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        while (T-- > 0) {
            String first = br.readLine();
            String second = br.readLine();
            System.out.println(new XSquareTwoStrings().hasSubsequence(first, second));
        }
    }
}
