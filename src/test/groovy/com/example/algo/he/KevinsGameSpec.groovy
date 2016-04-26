package com.example.algo.he

import spock.lang.Specification
import spock.lang.Unroll

class KevinsGameSpec extends Specification {
    @Unroll
    def "#N => #result"() {
        setup:
        def cut = new KevinsGame()
        expect:
        cut.getResult(N) == result

        where:
        N | result
        1 | "1 0\n+"
        2 | "2 1\n+-"
    }
}
