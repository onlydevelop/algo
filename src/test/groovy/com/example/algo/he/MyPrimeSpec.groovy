package com.example.algo.he

import spock.lang.Specification
import spock.lang.Unroll

class MyPrimeSpec extends Specification {
    @Unroll
    def "(#N, #S) => #result"() {
        setup:
        def cut = new MyPrime()
        expect:
        cut.getPrimeWithLine(N, S) == result

        where:
        N  | S                | result
        5  | "10 5 3 15 16"   | "5 3 16"
    }
}
