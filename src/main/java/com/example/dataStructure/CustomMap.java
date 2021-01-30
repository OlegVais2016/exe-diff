package com.example.dataStructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CustomMap {
    private Map<Integer, Integer> map = new HashMap<>();
    private Set<Integer> allKeys = new HashSet<>();
    private Integer forAll = null;

    public void set(int key, int value) {
        map.put(key, value);
        allKeys.add(key);
    }

    public Integer get(int key) {
        if (map.containsKey(key)) {
            return map.get(key);
        } else if (allKeys.contains(key)) {
            return forAll;
        } else {
            return null;
        }
    }

    public void setAll(int value) {
        forAll = value;
        map = new HashMap<>();
    }


}
