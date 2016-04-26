package com.example.algo.he

import spock.lang.Specification
import spock.lang.Unroll

class TrailingZerosSpec extends Specification {
    @Unroll
    def "For #N!, trailing zeros #result"() {
        setup:
        def cut = new TrailingZeros()

        expect:
        cut.getTrailingZeros(N) == result

        where:
        N  | result
        10 | 2
    }
}
