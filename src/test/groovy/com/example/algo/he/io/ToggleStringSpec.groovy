package com.example.algo.he.io

import spock.lang.Specification
import spock.lang.Unroll

class ToggleStringSpec extends Specification {
    @Unroll
    def "results #output for #input"() {
        setup:
        def cut = new ToggleString()

        expect:
        cut.changeCase(input) == output

        where:
        input  | output
        "AbCd" | "aBcD"
        "aa"   | "AA"
        "RrHRxcUsSrvSnTyolvsxHoGyzwBMzuLCUjcSeWmBAhodtEkgZjDkFjaXXAvjTvRfHuHGtopoxaeONzFFurfNlRdAvRYlnlfdIMsI" | "rRhrXCuSsRVsNtYOLVSXhOgYZWbmZUlcuJCsEwMbaHODTeKGzJdKfJAxxaVJtVrFhUhgTOPOXAEonZffURFnLrDaVryLNLFDimSi"
    }
}
