package com.example.algo.he.io

import spock.lang.Specification
import spock.lang.Unroll

class PalindromSpec extends Specification {
    @Unroll
    def "results #output for #input"() {
        setup:
        def cut = new Palindrom()

        expect:
        cut.isPalindrom(input) == output

        where:
        input  | output
        "fnjzxnxnjplfwzowfdrhrvhegkmoncbkembjoudteqchjwqfzlofyflkmxnooasxulwofjzknthqqxgshvwxdvhdnlzjzdjdiifg" |  "FALSE"
        "eovbgggijqjdsdhjyojeaujcdyyyxtpjlllowjyarfhxjxwkxpranhtlucoklahtokmqyozlrwhldozgbgpalkqlcsiowyeslusn" |  "FALSE"
        "sqfopldohhwnbhhpnbxiwzvkybggkgtftvvaqpejznlxluatcppctaulxlnzjepqavvtftgkggbykvzwixbnphhbnwhhodlpofqs" |  "TRUE"
        "izvnxvusaemgsgujwjaxkwdyeufbpfgbilfyxozyssuufxwfduudfwxfuussyzoxyflibgfpbfueydwkxajwjugsgmeasuvxnvzi" |  "TRUE"
    }
}
