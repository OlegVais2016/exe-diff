package com.example.exe_diff;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        Map<Integer,String>hashMap = new HashMap<>();
        hashMap.put(11,"a");
        Collections.unmodifiableMap(hashMap);
        hashMap.put(12,"b");
        System.out.println(hashMap);
    }
}
