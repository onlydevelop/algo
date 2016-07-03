package com.example.algo.he.bit

import spock.lang.Specification
import spock.lang.Unroll

class MagicSpec extends Specification {
    @Unroll
    def "results #output for #N"() {
        setup:
        def cut = new Magic()

        expect:
        cut.countDays(N) == output

        where:
        N    | output
        790  | 5
        487  | 7
        67   | 3
        167  | 5
    }
}
