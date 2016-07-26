package com.example.algo.he.bit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
 * https://www.hackerearth.com/problem/algorithm/monk-and-tasks/
 */
public class MonkAndTask {

    private int countBits(int n) {
        int count = 0;
        while(n > 0) {
            count++;
            n &= (n -1);
        }
        return count;
    }

    public String prepareTodo(int[] nums) {
        SortedMap<Integer, ArrayList<Integer>> todo = new TreeMap<Integer, ArrayList<Integer>>();

        for(int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int key = countBits(value);
            if(!todo.containsKey(key)) {
                ArrayList<Integer> ary = new ArrayList<Integer>();
                ary.add(value);
                todo.put(key, ary);
            } else {
                todo.get(key).add(value);
            }
        }

        StringBuilder sb = new StringBuilder();
        Set set = todo.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, ArrayList<Integer>> mentry = (Map.Entry)iterator.next();
            ArrayList<Integer> ary = mentry.getValue();
            for(int i: ary) {
                sb.append(i).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) throws Exception{
        MonkAndTask instance = new MonkAndTask();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for(int i = 0; i < T; i++) {
            line = br.readLine();
            int N = Integer.parseInt(line);
            line = br.readLine();
            String[] ais = line.split(" ");
            int[] A = new int[N];
            for(int j = 0; j < N; j++) {
                A[j] = Integer.parseInt(ais[j]);
            }
            System.out.println(instance.prepareTodo(A));
        }
    }
}
