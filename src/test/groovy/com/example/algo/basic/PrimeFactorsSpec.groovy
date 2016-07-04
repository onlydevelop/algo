package com.example.algo.basic

import spock.lang.Specification
import spock.lang.Unroll

class PrimeFactorsSpec extends Specification {
    @Unroll
    def "gcd of (#a, #b) should be #result"() {
        setup:
        def cut = new PrimeFactors()

        expect:
        cut.getPrimeFactors(n) == result

        where:
        n  | result
        2  | "[2]"
        4  | "[2, 2]"
        6  | "[2, 3]"
        12 | "[2, 2, 3]"
    }
}
