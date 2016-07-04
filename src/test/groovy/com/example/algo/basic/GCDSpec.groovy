package com.example.algo.basic

import spock.lang.Specification
import spock.lang.Unroll

class GCDSpec extends Specification {
    @Unroll
    def "gcd of (#a, #b) should be #result"() {
        setup:
        def cut = new GCD()

        expect:
        cut.gcd(a, b) == result

        where:
        a   | b  | result
        10  | 15 | 5
        15  | 10 | 5
        23  | 12 | 1
        1   | 1  | 1
    }
}
