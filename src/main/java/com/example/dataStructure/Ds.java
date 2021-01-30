package com.example.dataStructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ds {

    public static void main(String[] args) {
        testSimplestCondition();
        testNonExistingKeyAfterSetAll();
        testAddNewKeyKeyAfterSetAll();
    }

    public static void testSimplestCondition() {
        NewMap<String, Integer> newMap = new NewMap<>();
        newMap.put("k1", 1);
        newMap.put("k2", 2);
        newMap.put("k3", 3);
        newMap.put("k4", 4);
        System.out.println("newmap before setall " + newMap);
        newMap.setAll(99);
        System.out.println("newmap after setall " + newMap);
    }

    public static void testNonExistingKeyAfterSetAll() {
        NewMap<String, Integer> newMap = new NewMap<>();
        newMap.put("k1", 1);
        newMap.put("k2", 2);
        newMap.put("k3", 3);
        newMap.put("k4", 4);
        System.out.println("---------------------------");
        System.out.println("newmap before setall " + newMap);
        newMap.setAll(88);
        System.out.println("newmap after setall " + newMap);
        System.out.println("newmap get for key xyz " + newMap.get("xyz"));
    }

    public static void testAddNewKeyKeyAfterSetAll() {
        NewMap<String, Integer> newMap = new NewMap<>();
        newMap.put("k1", 1);
        newMap.put("k2", 2);
        newMap.put("k3", 3);
        newMap.put("k4", 4);
        System.out.println("---------------------------");
        System.out.println("newmap before setall " + newMap);
        newMap.setAll(77);
        System.out.println("newmap after setall " + newMap);
        newMap.put("k5", 5);
        System.out.println("newmap get for key k5 " + newMap.get("k5"));
        System.out.println("newmap after adding key " + newMap);
    }

    private static class NewMap<K, V> {

        private Map<K, V> innerMap;
        private V forAll;
        private Set<K> allKeys;

        NewMap() {
            innerMap = new HashMap<>();
            allKeys = new HashSet<>();
        }

        public V get(K key) {
            if (key != null) {
                if (!allKeys.contains(key) && innerMap.containsKey(key)) {
                    return forAll;
                } else return innerMap.get(key);
            } else return null;
        }

        public void put(K key, V value) {
            if (key != null) {
                allKeys.add(key);
                innerMap.put(key, value);
            }
        }

        public void setAll(V value) {
            allKeys = new HashSet<>();
            forAll = value;
        }

        @Override
        public String toString() {
            StringBuilder retStr = new StringBuilder();
            retStr.append("[");
            for (K key : innerMap.keySet()) {
                retStr.append(key).append("->").append(this.get(key)).append(", ");
            }
            retStr.append("]");
            return retStr.toString();
        }
    }

}
