package com.example.algo.he

import spock.lang.Specification
import spock.lang.Unroll

class WobblySpec extends Specification {
    @Unroll
    def "(#N, #K) => #result"() {
        setup:
        def cut = new Wobbly()

        expect:
        cut.findWobbly(N, K) == result

        where:
        N  | K   | result
        3  | 1   | "101"
        3  | 2   | "121"
        3  | 100 | "-1"
        4  | 3   | "1313"
        4  | 4   | "1414"
        5  | 2   | "12121"
    }
}
