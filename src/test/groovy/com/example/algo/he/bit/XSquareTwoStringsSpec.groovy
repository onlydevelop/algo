package com.example.algo.he.bit

import spock.lang.Specification
import spock.lang.Unroll

class XSquareTwoStringsSpec extends Specification {
    @Unroll
    def "results #output for #A"() {
        setup:
        def cut = new XSquareTwoStrings()

        expect:
        cut.hasSubsequence(A, B) == output

        where:
        A            | B            | output
        "phackej"    | "abhackerui" | "YES"
        "hello"      | "buy"        | "NO"
    }
}
