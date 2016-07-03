package com.example.algo.he.bit;

import java.util.Scanner;

/*
    https://www.hackerearth.com/problem/algorithm/the-magic/
 */
public class Magic {
    /*
        Stones  Binary  Days
          1      001     1
          2      010     1
          3      011     2
          4      100     1
          5      101     1
          ...
          41   101001    3
          pickup a stone => set right most bit 1
          Multiply by 2 any number of times in a day => k left shifts to put to correct place
          So, it is equal to 1 counts in the binary representation of the number
     */
    public int countDays(long N) {
        int count = 0;
        while (N > 0) {
            N = N & (N - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-- > 0) {
            long N = scanner.nextLong();
            System.out.println(new Magic().countDays(N));
        }
    }
}
