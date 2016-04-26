package com.example.algo.he

import spock.lang.Specification
import spock.lang.Unroll

class HungryLemursSpec extends Specification {
    @Unroll
    def "For [banana lemur] = [#line], minSteps => #minSteps"() {
        setup:
        def cut = new HungryLemurs()

        expect:
        cut.getMinSteps(line) == minSteps

        where:
        line        | minSteps
        "47 17"     | 2
        "32  3"     | 1
        "8   7"     | 1
        "7   6"     | 1
        "21  5"     | 1
        "35  4"     | 1
        "34  6"     | 2
        "5   1"     | 0
        "4   4"     | 0
        "93100 279" | 11
        "8   2"     | 0
        "11  2"     | 1
        "8229 74934"| 8229
        "0   0"     | 0
        "1   1"     | 0
        "2   1"     | 0
    }
}
