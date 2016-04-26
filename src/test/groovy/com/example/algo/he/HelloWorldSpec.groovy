package com.example.algo.he

import spock.lang.Specification
import spock.lang.Unroll

class HelloWorldSpec extends Specification {
    @Unroll
    def "says \"#helloMessage\" to \"#name\""() {
        setup:
        def cut = new HelloWorld()

        expect:
        cut.sayHello(name) == helloMessage

        where:
        name    | helloMessage
        "David" | "hello, David"
        ""      | "hello, none"
        null    | "hello, none"
    }
}
