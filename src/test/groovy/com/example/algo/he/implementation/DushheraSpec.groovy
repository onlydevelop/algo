package com.example.algo.he.implementation

import spock.lang.Specification
import spock.lang.Unroll

class DushheraSpec extends Specification {
    @Unroll
    def "results #output for #p,#k"() {
        setup:
        def cut = new Dushhera()

        expect:
        cut.getWinCombination(p, k) == output

        where:
        p   |  k    | output
        1   |  1    | "2"
        1   | 10000 | "10001"
        1   | 5000  | "5001"
        5   | 10000 | "10001 20002 30003 40004 50005"
        5   | 1     | "2 4 6 8 10"
    }
}
