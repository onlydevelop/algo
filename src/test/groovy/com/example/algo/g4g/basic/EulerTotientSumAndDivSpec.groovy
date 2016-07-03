package com.example.algo.g4g.basic

import spock.lang.Specification
import spock.lang.Unroll

class EulerTotientSumAndDivSpec extends Specification {
    @Unroll
    def "results #output for #N"() {
        setup:
        def cut = new EulerTotientSumAndDiv()

        expect:
        cut.getSum(N) == output

        where:
        N   | output
        1   |   1
        2   |   2
    }
}
