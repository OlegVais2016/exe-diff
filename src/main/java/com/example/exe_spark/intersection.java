package com.example.exe_spark;

import java.util.*;

public class intersection {

    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c", "d", "a", "a", "g", "f", "e"};
        String[] arr2 = {"a", "c", "x", "y", "c", "g", "a"};

        /*ArrayList<String> inter;
        if (arr2.length < arr1.length) {
            inter = check(arr2.length, arr1, arr2);
        } else {
            inter = check(arr1.length, arr2, arr1);
        }*/
      //  inter.forEach(System.out::println);
        System.out.println(Arrays.toString(check(arr1, arr2)));
    }

    private static String[] check(/*int length,*/ String[] arr1, String[] arr2) {
      //  ArrayList<String> inter = new ArrayList<>(/*length*/);
        Set<String> inter = new HashSet<>();
       // System.out.println(inter);
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (!map.containsKey(arr1[i])) {
                map.put(arr1[i], 0);
            }
          //  System.out.println(map.entrySet());
        }
        System.out.println("---------------");
        for (int i = 0; i < arr2.length; i++) { // O(1), O(log n), O(n), O n(log n), O(n2)
            Integer val = map.get(arr2[i]); //возвращает значение объекта, ключ которого равен arr2[i]. Если такого элемента не окажется, то возвращается значение null
         //   System.out.println(val);
            if (val != null && val == 0) {
                inter.add(arr2[i]);
             //   map.put(arr2[i], 1);
            }
         //   System.out.println(map.entrySet());
        }
        return  inter.toArray(new String[0]);
    }
}

