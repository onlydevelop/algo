package com.example.algo.basic

import spock.lang.Specification
import spock.lang.Unroll

class EulerTotientSpec extends Specification {
    @Unroll
    def "EulerTotient of #N should be #result"() {
        setup:
        def cut = new EulerTotient()

        expect:
        cut.phi(N) == result

        where:
        N | result
        1 | 1
        3 | 2
        6 | 2
        9 | 6
    }
}
