package com.example

import spock.lang.Specification

class AddingValueTest extends Specification {
    AddingValue addingValue = null;
    def "AddValue"() {
        setup:
        def value = "hello"
        Map map = new HashMap();
        when:
        map.put("1", value)
        then:
        map.get("1") == value+"dd"
    }
    def "should contain a map"() {
        given: 'map contain a value'
        def key ="1"
        def val ="2"
        Map map = new HashMap();
        map.put(key,val)

        when: 'a value found using key'
        def found = map.get(key)
        then:
        found == val
    }
}
