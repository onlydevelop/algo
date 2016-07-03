package com.example.algo.he.io

import spock.lang.Specification
import spock.lang.Unroll

class FactorialSpec extends Specification {
    @Unroll
    def "results #output for #l,#r,#k"() {
        setup:
        def cut = new Factorial()

        expect:
        cut.calculate(N) == output

        where:
        N  | output
        1  |  1
        5  |  120
        7  |  5040
        8  |  40320
        10 |  3628800
    }
}
