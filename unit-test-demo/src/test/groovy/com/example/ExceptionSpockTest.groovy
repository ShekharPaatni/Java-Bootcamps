package com.example

import spock.lang.Specification

class ExceptionSpockTest extends Specification {
    ExceptionSpock exceptionSpock = null
    void setup(){
        exceptionSpock = new ExceptionSpock()
    }
    def "carnary test" () {
        expect
        true
    }
    def "divide the two number"() {
        when:
        exceptionSpock.divide(15, 0)
        then:
        thrown(ArithmeticException)
    }
}
