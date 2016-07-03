package com.example.algo.he.bit

import spock.lang.Specification
import spock.lang.Unroll
class SubsetXORSpec extends Specification {
    @Unroll
    def "results #output for #N"() {
        setup:
        def cut = new SubsetXOR()

        expect:
        cut.getXORValue(N, K) == output

        where:
        N    | K  | output
        23   | 10 | 0
        1    | 10 | 10
    }
}
