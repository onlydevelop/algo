package com.example.algo.he;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/problem/approximate/kevin-plays-a-game/
 */
public class KevinsGame {
    public String getResult(int N) {
         /*
             N=1, X=0: 0 + 1, 1 - 2 (fail)
             N=2, X=1: 1 + 1, 2 - 2, 0 + 3 (fail)
             N=3, X=1: 1 + 1, 2 - 2, 0 + 3, 3 - 4 (fail)
             N=4, X=2: 2 + 1, 3 - 2, 1 + 3, 4 - 4, 0 + 5 (fail)
             N=5, X=2: 2 + 1, 3 - 2, 1 + 3, 4 - 4, 0 + 5, 5 - 6 (fail)
             X = N/2

             +1 -2 +3 -4
             x+1, x-1, x+2, x-2
             N=5, x=2, 2+1,3-2,1+4
             */
        int x = N / 2;
        StringBuilder sb = new StringBuilder();
        for(int t = 0; t < N; t++) {
            sb = (t % 2 == 0) ? sb.append("+") : sb.append("-");
        }
        return N + " " + x + "\n" + sb.toString();
    }

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for (int i = 0; i < T; i++) {
            line = br.readLine();
            int N = Integer.parseInt(line);
            System.out.println(new KevinsGame().getResult(N));
        }
    }
}
