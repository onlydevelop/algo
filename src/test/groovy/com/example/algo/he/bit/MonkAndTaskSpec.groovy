package com.example.algo.he.bit

import spock.lang.Specification
import spock.lang.Unroll

class MonkAndTaskSpec extends Specification {
    @Unroll
    def "results #output for #A"() {
        setup:
        def cut = new MonkAndTask()

        expect:
        cut.prepareTodo(A) == output

        where:
        A                                   | output
        convertIntegers([3, 4, 7, 10])      | "4 3 10 7"
        convertIntegers([7, 3, 15, 2, 4])   | "2 4 3 7 15"
    }

    def int[] convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()]
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue()
        }
        ret
    }
}
