package com.example.intersection;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Intersection4 {
    public static void main(String[] args) {

        String[] a = {"a","c","a","f"};
        String[] b = {"a","d","c"};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println(myIntersect(a,b));
    }
    private static List<String> myIntersect(String[] a, String[]b ){
        Set<String> c = Arrays.stream(a).collect(Collectors.toSet());
        System.out.println(c);
        return Stream.of(b).filter(c::contains).collect(Collectors.toList());
    }
}
