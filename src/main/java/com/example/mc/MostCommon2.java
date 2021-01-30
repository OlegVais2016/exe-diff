package com.example.mc;

import java.util.*;

public class MostCommon2 {

    public static void main(String[] args) {
        Integer[] arr = {55,77,44,55,12,44,78,55,12,99,12};
     //   Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(mostCommon(arr));
    }
    public static Integer mostCommon(Integer[]arr){
        // нашли мапу число - число его повторений в массиве
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : arr) {
            Integer value = map.get(element);
            if (value == null) {
                value = 0;
            }
            map.put(element, ++value);
        }
        // нашли колекцию числа разных повторений
        Set<Integer> keys = map.keySet();
        System.out.println(keys);
        Collection<Integer> values = map.values();
        System.out.println(values);
        // выбрали из этой коллекции наибольшее число(повторений в даном случае)
        Integer max = Collections.max(values);
        Integer most = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max.equals(entry.getValue())) {
                most = entry.getKey();
            }
        }
        return most;

    }
}
