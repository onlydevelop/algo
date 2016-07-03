package com.example.algo.he.io

import spock.lang.Specification
import spock.lang.Unroll

class CountDivisorsSpec extends Specification {
    @Unroll
    def "results #output for #l,#r,#k"() {
        setup:
        def cut = new CountDivisors()

        expect:
        cut.getCount(l, r, k) == output

        where:
        l    |  r   |  k  | output
        200  |  300 |  2  | 51
        567  |  943 |  3  | 126
        347  | 1000 | 432 | 2
        1000 | 1000 | 999 | 0
    }
}
