package com.example.algo.he.io

import spock.lang.Specification
import spock.lang.Unroll

class RoyPictureSpec extends Specification {
    @Unroll
    def "results #output for #L, #N, W, #H"() {
        setup:
        def cut = new RoyPicture()

        expect:
        cut.showResponse(L, N, W, H) == output

        where:
        L   | N | W   | H   | output
        180 | 3 | 640 | 480 | "CROP IT"
        180 | 3 | 120 | 300 | "UPLOAD ANOTHER"
        180 | 3 | 180 | 180 | "ACCEPTED"
    }
}
