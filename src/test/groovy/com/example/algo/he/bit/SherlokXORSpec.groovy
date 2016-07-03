package com.example.algo.he.bit

import spock.lang.Specification
import spock.lang.Unroll

class SherlokXORSpec extends Specification {
    @Unroll
    def "results #output for #A"() {
        setup:
        def cut = new SherlokXOR()

        expect:
        cut.countPairs(A) == output

        where:
                 A                    | output
        convertIntegers([1, 2, 3])    | 2
        convertIntegers([1, 2, 3, 4]) | 4
    }

    def int[] convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()]
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue()
        }
        ret;
    }
}
