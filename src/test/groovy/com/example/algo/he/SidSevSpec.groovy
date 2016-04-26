package com.example.algo.he

import spock.lang.Specification
import spock.lang.Unroll

class SidSevSpec extends Specification {
    @Unroll
    def "(#a, #H, #THETA_MAX) => #safeHeight"() {
        setup:
        def cut = new SidSev()

        expect:
        cut.getSafeHeight(a, H, THETA_MAX) == safeHeight

        where:
        a  | H   | THETA_MAX  | safeHeight
        50 | 40  | 30         | 26
    }
}
