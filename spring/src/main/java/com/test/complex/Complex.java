package com.test.complex;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Complex {
    private List<Integer> integerList;
    private Set<String> stringSet;
    private Map<String, Integer> stringIntegerMap;

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Map<String, Integer> getStringIntegerMap() {
        return stringIntegerMap;
    }

    public void setStringIntegerMap(Map<String, Integer> stringIntegerMap) {
        this.stringIntegerMap = stringIntegerMap;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "integerList=" + integerList +
                ", stringSet=" + stringSet +
                ", stringIntegerMap=" + stringIntegerMap +
                '}';
    }
}
