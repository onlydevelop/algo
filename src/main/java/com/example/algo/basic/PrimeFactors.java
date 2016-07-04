package com.example.algo.basic;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimeFactors {

    public String getPrimeFactors(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        while(n % 2 == 0) {
            a.add(2);
            n /= 2;
        }

        for(int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                a.add(i);
                n /= i;
            }
        }
        if(n > 2) a.add(n);
        return a.toString();
    }

    public static void main(String[] args) {
        PrimeFactors primeFactors = new PrimeFactors();
        for(int i = 1; i <= 12; i++) {
            System.out.printf("PrimeFactor(%d) = %s\n", i, primeFactors.getPrimeFactors(i));
        }
    }
}
