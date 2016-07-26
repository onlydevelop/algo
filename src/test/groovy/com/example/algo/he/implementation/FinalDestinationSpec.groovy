package com.example.algo.he.implementation

import spock.lang.Specification
import spock.lang.Unroll

class FinalDestinationSpec extends Specification {
    @Unroll
    def "results #output for #input"() {
        setup:
        def cut = new FinalDestination()

        expect:
        cut.getDestination(input) == output

        where:
        input     | output
        "LLRDDR"  | "0 -2"
    }
}
