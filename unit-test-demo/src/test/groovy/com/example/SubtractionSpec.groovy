package com.example

import spock.lang.Ignore
import spock.lang.Specification

class SubtractionSpec extends Specification {
    Subtraction subtraction = null;
    void setup() {
        subtraction = new Subtraction();
    }
    def "Sub"() {
       expect:
       subtraction.sub(15,10) == 5
    }

    def "Sub1"() {
        expect:
        subtraction.sub(18.7,16.7) == 2
    }
    @Ignore
    def "Intersection"() {
        expect:
        subtraction.intersection(Arrays.asList(10,15,20,15,25,100),Arrays.asList(15,18,20,02,00,8)) == [10, 25, 100, 18, 2, 0, 8]
    }
}
