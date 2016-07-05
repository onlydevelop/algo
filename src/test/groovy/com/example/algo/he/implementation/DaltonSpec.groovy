package com.example.algo.he.implementation

import com.example.algo.he.bit.Magic
import spock.lang.Specification
import spock.lang.Unroll

class DaltonSpec extends Specification {
    @Unroll
    def "results #output for #N"() {
        setup:
        def cut = new Dalton()

        expect:
        cut.printSectionStrengths(N) == output

        where:
        N  | output
        6  | "3 3"
        9  | "4 5"
    }
}
