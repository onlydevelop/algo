package com.example.algo.basic;

/*
    Euler’s Totient function Φ(n) for an input n is count
    of numbers in {1, 2, 3, …, n} that are relatively prime
    to n, i.e., the numbers whose GCD (Greatest Common Divisor)
    with n is 1.
 */
public class EulerTotient {
    public int phi(int N) {
        int count = 1;
        for(int i = 2; i < N; i++) {
            if(gcd(i, N) == 1) count++;
        }
        return count;
    }

    private int gcd(int a, int b) {
        return b ==0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        EulerTotient eulerTotient = new EulerTotient();
        for(int i = 1; i <= 10; i++) {
            System.out.printf("phi(%d) = %d\n", i, eulerTotient.phi(i));
        }
    }
}
