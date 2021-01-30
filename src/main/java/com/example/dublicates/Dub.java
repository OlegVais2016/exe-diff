package com.example.dublicates;

import java.util.*;

public class Dub {
    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "cow", "sheep", "cat", "dog"};
        System.out.println("Входной массив: " + Arrays.toString(animals));
        System.out.println("Дубликаты: " + getDuplicatesWithIteration(animals));
    }
    public static <T> List<T> getDuplicatesWithIteration(T[] a) {
        Set<T> duplicates = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            T e1 = a[i];
            if (e1 == null) continue; // игнорируем null
            // сравниваем каждый элемент со всеми остальными
            for (int j = 0; j < a.length; j++) {
                if (i == j) continue; // не проверяем элемент с собой же
                T e2 = a[j];
                if (e1.equals(e2)) {
                    // дубликат найден, сохраним его
                    duplicates.add(e2);
                }
            }
        }
        return new ArrayList<>(duplicates);
    }

}
