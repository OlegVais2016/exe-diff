package com.example.exe_spark;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class intersection {

    public static void main(String[] args) {
        String[] arr2 = {"a", "b", "c", "d", "a", "a", "f"};
        String[] arr1 = {"a", "c", "x", "y", "c", "a"};

        ArrayList<String> inter;
        if (arr2.length < arr1.length) {
            inter = check(arr2.length, arr1, arr2);
        } else {
            inter = check(arr1.length, arr2, arr1);
        }
        inter.forEach(System.out::println);
    }

    private static ArrayList<String> check(int length, String[] arr1, String[] arr2) {
        ArrayList<String> inter = new ArrayList<>(length);
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            if (!map.containsKey(arr2[i])) {
                map.put(arr2[i], 0);
            }
        }
        for (int i = 0; i < arr1.length; i++) { // O(1), O(log n), O(n), O n(log n), O(n2)
            Integer val = map.get(arr1[i]);
            if (val != null && val == 0) {
                inter.add(arr1[i]);
                map.put(arr1[i], 1);
            }
        }
        return  inter;
    }
}

