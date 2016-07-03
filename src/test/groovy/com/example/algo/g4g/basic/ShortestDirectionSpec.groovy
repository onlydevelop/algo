package com.example.algo.g4g.basic

import spock.lang.Specification
import spock.lang.Unroll

class ShortestDirectionSpec extends Specification {
    @Unroll
    def "results #output for #N"() {
        setup:
        def cut = new ShortestDirection()

        expect:
        cut.getShortestDir(direction) == shortest

        where:
        direction              | shortest
        "SSSNEEEW"             | "EESS"
        "NESNWES"              | "E"
        "SSESNEWSEWE"          | "EESSS"
        "EENENSSENWWNNSWSEWSN" | "EN"
    }
}
