package com.example.algo.he.implementation

import spock.lang.Specification
import spock.lang.Unroll

class LittleJhulSpec extends Specification {
    @Unroll
    def "results #output for #input"() {
        setup:
        def cut = new LittleJhul()

        expect:
        cut.checkString(input) == output

        where:
        input         | output
        "0001111110"  | "Sorry, sorry!"
        "0001001001"  | "Good luck!"
    }
}
